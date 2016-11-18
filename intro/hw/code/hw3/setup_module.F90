!!------------------------------------------------------------------
!! A Fortran example code for approximating pi 
!! 
!! This code is written by Suhan Liu for AMS 209 HW 3 problem 3
!!
!! This module has one subroutine which initialize your setup
!! by reading in runtime parameters from 'pi_approx.init' file.
!! The setup_init subroutine calls read_initFile*** subroutines
!! that are implemented by Prof. Dongwook Lee as subroutines in 
!! read_initFile_module. 
!!
!!------------------------------------------------------------------

module setup_module

#include "definition.h"

	use read_initFile_module

	implicit none

	integer, save :: maxN
	real, save    :: threshold


contains

	subroutine setup_init()

		implicit none

		call read_initFileInt('pi_approx.init', 'maxN', maxN)
		call read_initFileReal('pi_approx.init', 'threshold', threshold)


		print *, 'The following are runtime parameters: '
	    print *, '======================================'
	    print *, '	  Max N: ', maxN
	    print *, 'Threshold: ', threshold
	    print *, '======================================'

	end subroutine setup_init

end module setup_module

