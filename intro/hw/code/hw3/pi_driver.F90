!!------------------------------------------------------------------
!! A Fortran example code for approximating pi 
!! 
!! This code is written by Suhan Liu for AMS 209 HW 3 problem 3
!!
!! * This routine is a driver routine which calls subroutines:
!!   
!!   RootFinder:
!!       |- setup_init (from setup_module)
!!       |
!!       |- pi_summation (from pi_module)
!!       | 
!!       |- output_write (from pi_writeOutput)
!!
!!------------------------------------------------------------------


program pi_driver

#include "definition.h"

	use setup_module,		only : setup_init, maxN, threshold
	use pi_module,			only : pi_summation
	use pi_writeOutput,		only : output_write

	implicit none

	!! local variables
	integer :: N
	real 	:: pi, pi_new, residual

	!! Define allocatable arrays
	real, allocatable, dimension(:) :: pi_history, res_history

	residual = 1.e8
	N = 0
	pi = 0.0


	!! Call setup_init to initialize the runtime parameters
	call setup_init()

	allocate( pi_history(maxN))
	allocate(res_history(maxN))

	do while (residual > threshold .and. N < maxN)
		call pi_summation(pi, pi_new, N, residual)

		pi_history(N + 1) = pi_new
		res_history(N + 1) = residual

		pi = pi_new
		N = N + 1
	end do

	!! Prepare to report outputs:
	!! (a) Short summary onto the screen
	if ((N < maxN) .and. (residual < threshold)) then
		print *, '+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++'
		print *, '             Solution Convergence Summary                          '
		print *, '+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++'
		print *, 'Your converged solution x = ', pi
		print *, 'Solution converged when N = ', N
		print *, 'Threshold value = ', threshold
		print *, 'Residual value = ', residual
		print *, '+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++'
  	end if

	call output_write(N, pi_history, res_history)

	deallocate(pi_history)
	deallocate(res_history)

end program pi_driver

