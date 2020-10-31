<template>
  <div class="not-found text-center">
    <g-image class="mx-auto" src="~/assets/images/404.svg"></g-image>
    <h3 class="uppercase font-bold text-3xl">page not found</h3>
    <p class="mt-2">
      The page you're looking for isn't available<br />
      Try to search again or use the Go Back button below.
    </p>
    <g-link to="/" class="mt-4 rounded-full inline-block uppercase font-bold py-3 px-8" data-cursor-hover>
      go back
    </g-link>
    <cursor-fx />
  </div>
</template>

<script>
export default {
  metaInfo: {
    title: '404',
  }
}
</script>

<style scoped>
.not-found {
  background: #fff;
  width: 100%;
  height: 100vh;
  overflow: hidden;
}

h3 {
  color: #2b2b2b;
}

p {
  color: #747474;
}

a {
  background: #FFCC00;
  color: #2b2b2b;
  transition: all .3s ease-in-out;
  border: 2px solid #FFCC00;
}

a:hover {
  background: #fff;
}

</style>
