!!------------------------------------------------------------------
!! A Fortran example code for approximating pi 
!! 
!! This code is written by Suhan Liu for AMS 209 HW 3 problem 3
!! 
!! This module has one subroutine which use summation to approximate
!! pi
!!------------------------------------------------------------------


module pi_module

#include "definition.h"

	use setup_module

contains

	subroutine pi_summation(pi, pi_new, N, residual)

		implicit none
		integer, intent(IN) :: N
		real, intent(IN)  	:: pi
		real, intent(OUT) 	:: pi_new, residual

		pi_new = pi + (16.**(-N)) * (4./(8.*N+1.) - 2./(8.*N+4.) - 1./(8.*N+5.) - 1./(8.*N+6.))
		residual = abs(pi_new - pi_trueValue)
	end subroutine pi_summation

end module pi_module
