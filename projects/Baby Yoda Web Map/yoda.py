import folium
import webbrowser
import time

# defining variable
address = []
locations = ["custom location", "micro club", "tokyo", "yokohama", "algiers", "usthb"]
answer = ""
tip = "Baby Yoda on a trip!"
float 
# intro
print("Greetings!\nThis is a basic web map app you can use to spawn map in precise locations.\n Take baby Yoda on a trip!")
while True:
# asking for user's input from the displayed destination list
  while answer not in locations:
    answer = input("pick a location from the list or choose custom location: {}\n".format(locations, sep = ",") + "\n >>  ")
    if answer == "tokyo":
      address = [35.687307, 139.752268]
      print("You've chosen Tokyo, please wait for the map to be generated.\n")
    elif answer == "yokohama":
      address = [35.4437, 139.6380]
      ("You've chosen Yokohama, please wait for the map to be generated.\n")
    elif answer == "algiers":
      address = [36.772509, 3.059135]
      ("You've chosen Algiers, please wait for the map to be generated.\n")
    elif answer == "usthb":
      address = [36.713283, 3.179707]
      ("You've chosen USTHB, please wait for the map to be generated.\n")
    elif answer == "micro club":
      address = [36.715650, 3.185293]
    elif answer == "custom location":
      print("Enter place coordinates, \n e.g: Santa Monica would be: \n 34.00983\n -118.4953\n -------------")
      lgt = float(input("Enter longitude coordinate: "))
      lat = float(input("Enter latitude coordinate: "))
      address = [lgt, lat]
    else:
      print("we don't cover that area.\n")

# creating the map with user's chose location
  m = folium.Map(location=address, tiles='CartoDB dark_matter', zoom_start=14)

# adding a marker in that same location
  avatar = folium.features.CustomIcon('BabyYodaSprite.gif', icon_size=(64, 64))
  folium.Marker(location=address, tooltip=tip, icon=avatar).add_to(m)

#saving the map as an html fiel in the same app folder
  m.save('map.html')

  print("map generated successfuly.")
# openning the generatd map in default browser
  time.sleep(1)
  webbrowser.open_new_tab('map.html')

  input("wanna go somewhere else? \n")
  restart = input("")
  if not restart == "yes":
    break
