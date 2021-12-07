console.log('%s has %d points', 'Sam', 100);
console.log('%cHello world!', 'color: blue; font-size: xx-large');
console.log("%cHello %cWorld%c!!", // string to be printed
 "color: blue;", // applies color formatting to the 1st substring
 "font-size: xx-large;", // applies font formatting to the 2nd substring
 "/* no CSS rule*/" // does not apply any rule to the remaining substring
);

console.table(['Hello', 'world']);
console.table({foo: 'bar', bar: 'baz'});
// Objeto en JS
var personArr = [
    {
     "personId": 123,
     "name": "Jhon",
     "city": "Melbourne",
     "phoneNo": "1234567890"
    },
    {
     "personId": 124,
     "name": "Amelia",
     "city": "Sydney",
     "phoneNo": "1234567890"
    },
    {
     "personId": 125,
     "name": "Emily",
     "city": "Perth",
     "phoneNo": "1234567890"
    },
    {
     "personId": 126,
     "name": "Abraham",
     "city": "Perth",
     "phoneNo": "1234567890"
    }
    ];
    
    console.table(personArr, ['name', 'personId']);

var o1 = 1, o2 = '2', o3 = "";
console.count(o1);
console.count(o2);
console.count(o3);
console.count(1);
console.count('2');
console.count('');

console.count(42.3);
console.count(Number('42.3'));
console.count('42.3');

console.count(console.constructor);
console.count(function(){});
console.count(Object);
var fn1 = function myfn(){};
console.count(fn1);
console.count(Number);

console.count(undefined);
console.count(document.Batman);
var obj;
console.count(obj);
console.count(Number(undefined));
console.count(NaN);
console.count(NaN+3);
console.count(1/0);
console.count(String(1/0));
console.count(window);
console.count(document);
console.count(console);
console.count(console.__proto__);
console.count(console.constructor.prototype);
console.count(console.__proto__.constructor.prototype);
console.count(Object.getPrototypeOf(console));
console.count(null);

var myObject = {
    "foo":{
    "bar":"data"
    }
   };
console.dir(myObject);

console.dirxml(document)

console.log(document)
