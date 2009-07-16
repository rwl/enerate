# @copyright: 2009 Richard W. Lincoln
# @contact: r.w.lincoln@gmail.com
# @license: GPLv3



ecore
ecore
ecore
ecore
coffeeshop

from traits.api import HasTraits, Instance, List, Str, Date, Float, Int


DistributorType = Enum("Coffee Bean Distributor", "Cup Distributor")

class Shop():
    shopEmployees = List(Instance(Employee))
    shopCoffeeMachines = List(Instance(CoffeeMachine))
    shopManagers = List(Instance(Manager))
    storeRegisters = List(Instance(CashRegister))
    storeRoom = Instance("coffeeshop.StoreRoom.StoreRoom")
    accounts = List(Instance(Account))
    distributors = List(Instance(Distributor))
        shopName = EString


class Employee():
    mannedCoffeeMachine = Instance("coffeeshop.CoffeeMachine.CoffeeMachine")
    mannedCashRegister = Instance("coffeeshop.CashRegister.CashRegister")
        employeeName = EString


class CoffeeMachine():
        machineName = EString
        datePlacedInService = EDate


class Manager():
    managersEmployees = List(Instance(Employee))
        managerName = EString


class CashRegister():
        amountOfMoney = EDouble
        registerName = EString


class StoreRoom():
    sacksOfBeans = List(Instance(SackOfBeans))
    boxesOfCups = Instance("coffeeshop.BoxOfCups.BoxOfCups")


class SackOfBeans():
        sizeInPounds = EInt
        percentFull = EDouble


class BoxOfCups():
        numberOfCupsAvailable = EInt


class Distributor():
    accounts = List(Instance(Account))
        distributorName = EString
        distributorType = DistributorType


class Account():
        balance = EDouble
        creditLimit = EDouble


