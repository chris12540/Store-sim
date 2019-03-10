# Store

You walk into an electronic store during Thanksgiving day. They give out a few items for free to the first hundred customers. A customer picks a number between 1 and 10 (inclusive) and gives it to the store rep. The store rep matches the number with a product and gives it to the customer. Products mainly fall under three categories: Computers, Home Entertainment, and Office Supplies. All these categories have some common features. They also have their own distinct features (Computers have ‘warranty’, ‘processor’; Home Entertainment has ‘warranty’, ‘weight’, ‘installation’; Office Supplies have ‘ageLimit’, ‘chemicals’)
Computers and Home Entertainment products can be returned, but Office Supplies cannot.

Write a program to generate a random number between 1 to 10 (inclusive). Fetch the right product based on the generated number. If the product is a returnable item, return it and fetch another product that’s not returnable.

__If a customer returns products more than thrice, throw an exception saying that “You are no longer eligible for this offer as you are abusing it!”__

_Helper classes – Math, HashMap, Exception._