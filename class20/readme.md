Use case basics. 
================
What is usecase?

they captures the functional requirements / behavarioal requirements of a system. 

Usecases describe the interactions between various actors and the system. 

=================

Usecase Elements: 
-----------------
Example ATM. 
Actor: Has a goal in using the system -> anything or anyone that has some goal using the system. -> actors are role based not as individuals. -> eg. someother system, a manager, a student, etc. 

Goal: What the actor wants to achieve by interacting with the system. -> for atm an actor is customer and goal of customer is to withdraw money. 


Use cases captures the different goals that various actors have in using the system. 

Use cases are found in requirement specification. 

UML use case diagrams serve as a visual Table of Contents to written use cases. 

==================
Written usecases. 
-----------------
Describe the steps involved in an interaction between an actor and the system, beginning with the primary actor. -> primary actor is the one who initiate the usecase. 

Start with the main success scenario. -> (happy path, where everything goes right, the path in ATM case where customer inserts a card and gets the money without any problem)  -> ideal case. 

Look for alternative path: 
	Exceptions: What could go wring here? (what if customer is trying to withdraw money > amount balance) 

	Extentions: What other goal might come into play here? (e.g. some ATMs gives you an option to whether or not to print a receipt?) 

========================================

Rectangle (system with name)
Actors (stick figures with lable as role)
Use cases (elipses) 

Online Reservation System. -> star UML

=========================================

goal if system can take care of -> inside the system. 
else its not a usecase. 

=========================================

ATM System -> star UML 

=========================================

include and extends. 

Relationship between using depandancy:

include: necessary relaitonship between usecases. 
the invoking usecase depands on the included usecase to order to be complete. 

including usecase ----------------> included usecase 
                     <<include>>

eg. 

left depands on right in this example. 

eg. online purchasing app. 

Make Purchase ---------------------> Verify Credit Card
                 <<include>>

to make a purchase we need to verify the credit card. (have to) 

e.g. ATM exmaple 

withdraw cash ----------> verify balance

transfer fund ----------> verify balance


included comes in right mostly. 

========================



extend depandancy (optional relationship)

base use case <---------------- extending usecase
		<<extend>>

extending usecase extends the behaviour of base usecase. 

Direction of arrow shows direction of depandancy. 

convension: extending usecase comes at downside of base usecase 

e.g. 

purchase gas with credit card <------------- print receipt
                                <<extend>>

extension usecases are secondary. 

extended usecases are not mendatory. 
==============================================
Generalization: (type of relation between actors and usecases) 

parent ------------> child 1
   |
   |
   |-----------------> child 2

Triangular Arrow (same as class diagram) 

e.g. ATM 

(parent) Do a Transaction -----------> withdraw cash (child 1)
                 -----------> Deposite Funds (child 2)
                 -----------> Transfer Funds (child 3)


=====================

Generalization between actors. 

Customer (actor) <<========== Corporate customers (child actor)


