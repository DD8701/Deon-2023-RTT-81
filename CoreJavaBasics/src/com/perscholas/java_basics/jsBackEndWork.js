/**
 * 
 */
/*console.log((10 - 5 >= 5 % 2) && !(12 * 3 <= 100 / 3)); //true
console.log((10 - 5 >= 5 % 2) && !(12 * 3 <= 100 / 5)); //true
console.log(3 > 4 && 4 == 4); //false
console.log(3 > 4 || 4 == 4); //true
console.log((5 != 5 || 4 > 4) && !(2 == 2)); //false
console.log((5 % 2 >= 2) && (!false || 4 < 0)); //false
console.log((2 >= 2 && 10 % 3 == 1) || ((10 < 11 && 2 != 3) || 2 == 12)); //true
console.log((5 <= 3 || 6 > 0) && (20 % 3 == 2 && 88 / 2 > 30)); //true*/

/*------------------------------------------------------------------------*/

/*//Starting with $10,000, how many years will it take to 
//double that initial balance to reach $20,000 at 5% interest?
const RATE = 0.05; //compute interest
const INITIAL_BALANCE = 10000; //beginning balance
let balance = INITIAL_BALANCE; //declaring balance
let target = 2 * INITIAL_BALANCE; //target is double the initial balance
let year = 0; // beginning year

while(balance < target){ //While beg bal is less than target bal
	let interest = balance * RATE; // interest is balance * rate
	balance += interest; //increment balance adding interest 
	year++; //increment year until condition is met.
}
console.log("The investment doubles after " + year + " years."); //print result
*/
/*------------------------------------------------------------------------*/
/*//while() loops examples:
let i = 5;

/*while(i>0){
	console.log(i+" ");
	i--;
}*/


/*while(i>0){
	console.log(i+" ");
	i++; //creates infinite loop
}*/



/*while(i>5){
	console.log(i +" ");
	i--; //No output. the statement is false and loop in never executed.
}
*/
/*------------------------------------------------------------------------*/
//for() loops examples:
/*for (let i = 0; i <= 5; i++){
	console.log(i + " "); //when i reaches 6 via i++ loop condition becomes false and loop ends
}


for (let i = 5; i >= 0; i--){
	console.log(i + " "); //reaches -1 via i-- statement, loop condition becomes false and loop ends
}


for (let i = 0; i != 9; i += 2){
	console.log(i + " ");// infinite loop because i is never equal to 9 in this example. i is increased by 2 each time.
}

*/
/*------------------------------------------------------------------------*/
/*//Consider the following loop.:
for (let index = 0; index <= 10 ; index++) {
console.log(index); 
}
//How many times do the first, second, and third argument get executed? 11
//What is the last value of the index at the point of failure? 11
//What is the last printed value of index? 10

//The answers to these questions change if the condition of the for loop is changed to index < 10;
*/
/*------------------------------------------------------------------------*/
/*//do...while() example:
//In this example, notice that the condition starts with being false, but because the body of
//the do...while loop is executed before the condition, it is executed at least one time.

/*let number = 4;
do {
	console.log("Printing")
	} while(number <3);


//What is the output of the following script?
 let number = 1;
 do {
	 let value = number * 2;
	 number ++;
	 console.log(value);
	 } while (number <= 5);
 */
/*------------------------------------------------------------------------*/

/*//Write scripts that achieve the following via loops:

//Print all even numbers from 0 to 100.
let a = 0;
for( a = 0; a <= 100; a+=2){
	console.log(a);
}

//Print all odd numbers from 0 to 100.
let b = 1;
for ( b = 1; b < 100 && b > 0; b+=2) {
	console.log(b);
}

//Given a number, determine if the number is prime, and print “Yes” or “No.”
function isPrimeNumber(number){
	if(number <= 1){
		return false;
	}
	
	for (let i = 2; i <= Math.sqrt(number); i++){
		if(number % 1 === 0){
			return false;
		}
	}
	return true;
}

	if (isPrime(17)){
		console.log("Yes");
	}else{
		console.log("No");
	}*/
/*=============================================================================*/

/*//Print all numbers divisible by 4 and 6 for all numbers between 10 and 1,000 (inclusive).
for (let i = 10; i <= 1000; i++) {
    if (i % 4 === 0 && i % 6 === 0) {
        console.log(i + " is divisible by 4 and 6");
    }
}*/
/*=============================================================================*/

// Let’s create a program that would ask the user for an arithmetic expression. 
// This program would separate all operators and all numbers.
// There are already classes that do this type of work, 
// but it is helpful to know how to implement your own version.

//For this activity, we will make the following assumptions about the user’s input:
//Any character that is not a number or whitespace is an operator.
//There are no letters within the string, only numbers and operators.

let userInput = "43 + 56^8 * 6";
userInput = prompt("Enter an Arithmetic Expression");
console.log(userInput);

for (let i = 0; i < userInput.length; i++){
	let c = userInput[i]; //the current character
}
if (c >= '0' && c <= '9') {
      numbers += c + SEPARATOR; // do something with numbers
      } else if (c == ' ') {
   } else {
      operators += c + SEPARATOR; // do something with things that aren’t numbers
}
onsole.log("Numbers: ", numbers);
console.log("Operators: ", operators);

//Note that strings can contain spaces, and spaces are counted as characters when determining length.
//We can use this information to create a for loop that iterates through the length of a string, as 
//seen to the right.







