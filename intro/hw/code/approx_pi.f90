program approx_pi
	implicit none

	integer :: N, i
	real :: diff, pi_appx, pi_true
	real, dimension(4) :: threshold
	real, external :: f

	pi_true = acos(-1.d0)
	

	threshold(1) = 1.e-4
	threshold(2) = 1.e-8
	threshold(3) = 1.e-12
	threshold(4) = 1.e-16

	open(10,file='Pi_Approximation.txt')

	do i = 1,4
		N = 0
		pi_appx = 0
		diff = abs(pi_true - pi_appx)

		do while (diff > threshold(i))
		
			pi_appx = pi_appx + f(N)
			diff = abs(pi_true - pi_appx)
			N = N+1	

		end do

		write(10,*) 'threshold =',threshold(i)
		write(10,*) 'N =', N 
		write(10,*) 'diff =', diff
		write(10,*) 'The approximation of pi is', pi_appx
		write(10,*)
		write(10,*)

	end do

	close(10)

end program approx_pi

function f(N)
	implicit none

	integer :: N
	real :: f

	f = (16.**(-N)) * (4./(8.*N+1.) - 2./(8.*N+4.) - 1./(8.*N+5.) - 1./(8.*N+6.))

end function f