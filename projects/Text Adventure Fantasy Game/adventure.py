import random

# playables

class wizard (object):
  hp = 100
  stregth = 12
  defence = 12
  magic = 30

class warrior (object):
  hp = 100
  stregth = 30
  defence = 18
  magic = 10

class elf (object):
  hp = 100
  stregth = 20
  defence = 18
  magic = 18

# enemies

class goblin (object):
  name = "Goblin"
  hp = 60
  stregth = 10
  defence = 10
  magic = 8
  loot = random.randint(0,2)

class witch (object):
  name = "Witch"
  hp = 90
  stregth = 15
  defence = 15
  magic = 20
  loot = random.randint(0,2)

class orc (object):
  name = "Orc"
  hp = 100
  stregth = 20
  defence = 18
  magic = 10
  loot = random.randint(0,2)

def death(character):
  if character.hp < 1:
    print("YOU DIED!")
    print(".\n.\n.\n.")
    exit()


# selecting hero

def heroselect():
  print("select your character: ")
  selection = input("1. Wizard \n2. Warrior \n3. Elf\n")
  if selection == "1":
    character = wizard
    print("So, you're a warrior!\nYour stats:")
    print("Health: ", character.hp)
    print("Health: ", character.stregth)
    print("Health: ", character.defence)
    print("Health: ", character.magic)
    return character
  elif selection == "2":
    character = warrior
    print("So, you're a warrior!\nYour stats:")
    print("Health: ", character.hp)
    print("Health: ", character.stregth)
    print("Health: ", character.defence)
    print("Health: ", character.magic)
    return character
  elif selection == "3":
    character = elf
    print("So, you're an Elf!\nYour stats:")
    print("Health: ", character.hp)
    print("Health: ", character.stregth)
    print("Health: ", character.defence)
    print("Health: ", character.magic)
    return character
  else:
      print("\n Only press 1, 2 or 3\n")
      heroselect()

# spawn enemy
def enemyselect(goblin, witch, orc):
  enemylist = [goblin, witch, orc]
  encounter = random.randint(0,2)
  enemy = enemylist[encounter]
  return enemy

#spawn loot
def loot():
  loot = ["weapon","armor","potion"]
  lootRate = random.randint(0,2)
  lootDrop = loot[lootRate]
  return lootDrop

def battleState():
  enemy = enemyselect(goblin, witch, orc)
  print("A wild", enemy.name, "has appeared!")
  while enemy.hp > 0:
    action = input("Take action:\n1. Weapon \n2. Magic \n3.Run!\n>> ")
    
    ### Option 1
    if action == "1":
      print("You swing your sword, attacking the", enemy.name, " enemy!")
      hitrate = random.randint(0, 10)
      
      if hitrate > 3:
        enemy.hp = enemy.hp - character.stregth
        print ("You hit the enemy!\n", enemy.name, "health: ", enemy.hp)
        
        if enemy.hp > 0:
          character.hp = character.hp - (enemy.stregth/character.hp)
          print("The ", enemy.name, "enemy attacks you! You are hit!")
          print("You got", character.hp, "health left.\n")
          death(character)
        
        else:
          if enemy.name == "Goblin":
            enemy.hp = 60
          elif enemy.name == "Witch":
            enemy.hp = 150
          elif enemy.name == "Orc":
            enemy.hp = 150
        
          print("You have defeated the ", enemy.name, "\nIt dropped an item!")
          lootDrop = loot()
          print("You found a", lootDrop)
          break
      
      else:
        print("You missed your hit!")
        print("The ", enemy.name, "hits you directly!")
        character.hp = character.hp - enemy.stregth
        print("Your health stat is: ", character.hp)
        death(character)

    ### Option 2
    elif action == "2":
      print("You cast your spell, attacking the", enemy.name, " enemy!")
      hitrate = random.randint(0, 10)
      
      if hitrate > 3:
        enemy.hp = enemy.hp - character.magic
        print ("You hit the enemy!\n", enemy.name, "health: ", enemy.hp)
        
        if enemy.hp > 0:
          character.hp = character.hp - (enemy.magic/character.hp)
          print("The ", enemy.name, "enemy attacks you! You are hit!")
          print("You got", character.hp, "health left.\n")
          death(character)
        
        else:
          if enemy.name == "Goblin":
            enemy.hp = 60
          elif enemy.name == "Witch":
            enemy.hp = 150
          elif enemy.name == "Orc":
            enemy.hp = 150
        
          print("You have defeated the ", enemy.name, "\nIt dropped an item!")
          lootDrop = loot()
          print("You found a", lootDrop)
          break
      
      else:
        print("You missed your hit!")
        print("The ", enemy.name, "hits you directly!")
        character.hp = character.hp - enemy.magic
        print("Your health stat is: ", character.hp)
        death(character)

    ### Option 3
    elif action == "3":
      print("You try to run")
      hitrate = random.randint(0, 10)
      
      if hitrate > 4:
        print ("You got away!")
        break
      else:
        print ("You fail to escape.")
        print ("The enemy hits you directly!")
        character.hp = character.hp - enemy.stregth
        print("You got", character.hp, "health left.\n")
        death(character)
        
    else:
      print("Please press: 1, 2 or 3 only.")


character = heroselect()
battleState()



