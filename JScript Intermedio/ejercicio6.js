var hoy = Date();
console.log ("DATE PURO"+hoy);

var date1 = new Date();
hoy = date1.toTimeString();
console.log ("TIMESTRING"+hoy);

hoy = date1.toDateString();
console.log ("DATESTRING"+hoy);

hoy = date1.toUTCString();
console.log ("UTCSTRING"+hoy);

hoy = date1.toISOString();
console.log ("ISOSTRING"+hoy);

hoy = date1.toGMTString();
console.log("La fecha GMT: "+hoy);

hoy = date1.toLocaleDateString();
console.log("La fecha Locale Date: "+hoy);

var utcDate = new Date(Date.UTC(2000,0,31,12));
var localDate = new Date(2000,0,31,12);
console.log(localDate - utcDate === utcDate.getTimezoneOffset() * 60 * 1000)

// get milliseconds using static method now of Date
console.log(Date.now());
// get milliseconds using method getTime of Date instance
console.log((new Date()).getTime());

var year = (new Date()).getFullYear();
console.log(year);
// Sample output: 2021  
var month = (new Date()).getMonth();
console.log(month);
// Sample output: 7

//Get the current day
var day = (new Date()).getDate();
console.log(day);
// Sample output: 31
//Get the current hour
var hours = (new Date()).getHours();
console.log(hours);
// Sample output: 10
//Get the current minutes
var minutes = (new Date()).getMinutes();
console.log(minutes);
// Sample output: 39
//Get the current seconds
var seconds = (new Date()).getSeconds();
console.log(seconds);
// Sample output: 48
//Get the current milliseconds
//To get the milliseconds (ranging from 0 to 999) of an instance of a Date object, use its getMilliseconds method.
var milliseconds = (new Date()).getMilliseconds();
console.log(milliseconds);
// Output: milliseconds right now

var checkoutDate = new Date(); // Thu Jul 21 2016 10:05:13 GMT-0400 (EDT)
checkoutDate.setDate( checkoutDate.getDate() + 12 );
console.log(checkoutDate); // Tue Aug 02 2016 10:05:13 GMT-0400 (EDT)
