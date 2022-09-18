fun makeApiCall(location:Location){
    val request = Request.Builder().url("https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=${location.latitude},${location.longitude}&radius=1500&type=restaurant&key=YOUR_API_KEY")
                 .build()

    val response = OkHttpClient().newCall(request).execute().body().string()
    val jsonObject = JSONObject(response) // This will make the json below as an object for you

    // You can access all the attributes , nested ones using JSONArray and JSONObject here
}
