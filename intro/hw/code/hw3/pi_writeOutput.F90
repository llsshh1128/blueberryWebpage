!!------------------------------------------------------------------
!! A Fortran example code for approximating pi 
!! 
!! This code is written by Suhan Liu for AMS 209 HW 3 problem 3
!!
!! This module has one subroutine which writes an output 
!! to a data file named "pi_approx.dat"
!!
!!------------------------------------------------------------------


module pi_writeOutput

	implicit none

contains

	subroutine output_write(length, pi, residual)

		implicit none

		integer, intent(IN) 		   	:: length
		real, dimension(:), intent(IN) 	:: pi, residual
    	integer :: i
    	character(len=35) :: ofile

    	!! File name for ascii output
    	ofile = 'pi_approx.dat'

    	!! File open
    	open(unit=20,file=ofile,status='unknown')
    
    	!! Write into a file:
    	do i=1,length
       		write(20,920) i,pi(i),residual(i)
    	end do

    	!! Output format specifiers
920 format(1x, i5, f20.16, 1x, f20.16, 1x, f20.16)
    
    !! File close
    close(20)

  	end subroutine output_write
  
end module pi_writeOutput