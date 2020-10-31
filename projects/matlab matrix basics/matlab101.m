a=[500 200 466; 200 985 465;105 105 458]
b=[456 556 285; 648 452 252;525 524 545]
c=a+b
n = numel(c) %Number of array elements
size(c)%Returns the size of a matrix usfule for get dimensioning error messages
max(c)%Returnes largest elements
min(c)%Returnes smallest elements
sum(c)%Sums each column
sort(c) %sort each column
d=det(c)%Returnes matrix determinant
