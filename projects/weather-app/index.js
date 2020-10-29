window.navigator.geolocation
.getCurrentPosition(locationSucces, locationFail);

function locationFail(data) {
console.log("blocked");
fetchWeatherData(50, 50);
}

function locationSucces(data) {
fetchWeatherData(data.coords.longitude, data.coords.latitude);
}

function unixTimeStampToTime(unix_timestamp) {
const date = new Date(unix_timestamp * 1000);
const hours = date.getHours();
const minutes = "0" + date.getMinutes();
return hours + ':' + minutes.substr(-2);

}

function displayWeather(data) {
document.querySelector("#temperature").textContent = data.main.temp + "°C";
document.querySelector("#humidity").textContent = data.main.humidity + "%";
document.querySelector("#cloads").textContent = data.weather[0].description;
document.querySelector("#wind").textContent = data.wind.speed + " m/s";
document.querySelector("#city-input").value = `${data.name}  (${data.sys.country})`;

console.log(document.querySelector("#cloads"));
document.querySelector("#sunrise").textContent = unixTimeStampToTime(data.sys.sunrise);
document.querySelector("#sundown").textContent = unixTimeStampToTime(data.sys.sunset);
// document.querySelector(".city").textContent = data.name;





}

function fetchWeatherData(long, latt) {


const queryWeather = `https://fcc-weather-api.glitch.me/api/current?lat=${latt}&lon=${long}`;
 
fetch(queryWeather).then(response => response.json()).then(data => {

    if (data.name != "Shuzenji") {
        displayWeather(data);
        document.querySelector("button").classList.remove("running");
    } else {
        fetchWeatherData(long, latt);
        document.querySelector("button").classList.remove("running");
    }


})



}

function searchCity() {
document.querySelector("button").classList.add("running");
document.querySelector("i").classList.add("hidden");
const query = `https://geocode.xyz/${document.querySelector("#city-input").value}?json=1`;


fetch(query)
    .then(response => response.json())
    .catch(error => console.log(error))
    .then(data => {
        if (data != undefined) {


            if (data.longt != 0 && data.latt != 0) {
                if (data.success == false) {
                    alert("try again later")
                } else {
                    fetchWeatherData(data.longt, data.latt);
                }


            } else {
                document.querySelector("button").classList.remove("running");
                alert("no city like this found")
            }

        }
    }).catch(error => console.log(error));
}

document.querySelector("#search").addEventListener('click', searchCity);

