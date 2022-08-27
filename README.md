# Java-Program

## Single Element in a Sorted Array##
I/P: arr[] = 1,1,2,3,3,4,4,8,8 
O/P: 2

The Naive Approch Uisng XOP Operation
Time Complexity : O(n)
Space Complexity: O(1)

First we take a result variable initialize with 0 (int result = 0)
Then, traverse the array from left to right [for(int i=0; i<arr.length; i++)]
Then, we perform XOR operation with result with arr[element]. Because, XOR same number result is always 0. So, same element gives us 0 as result and only 1 element gives us result as 1 and that's the result

int SingleNonDuplicate(int[] arr){
int res = 0;
for(int i=0; i<arr.length; i++){
res = res ^ arr[i];
}
return res;
}

The Efficient Solution Using Binary Search
Time Complexity: O(nlogn)
Space Complexity: O(1)

start initialize with 0'th element
end initialize with arr.length - 2'th element. Because, If our odd appear element is at (arr.length-1)'th position then, start go to (arr.length-1)'th element and loop break
