<template>
  <div class="notfound flex justify-center items-center h-screen">
    <div class="w-full lg:w-1/2 text-center">
      <frown-icon  class="mx-auto icon"></frown-icon>
      <h1 class="text-xl md:text-2xl lg:text-3xl xl:text-4xl my-10">الصفحة التي تبحث عنها غير موجودة</h1>
      <g-link to="/" class="rounded-full px-6 py-2 text-sm md:text-xl">عودة للرئيسية</g-link>
    </div>
  </div>
</template>

<script>
import { FrownIcon } from "vue-feather-icons";
export default {
  components: {
    FrownIcon,
  },
};
</script>

<style scoped>

.icon {
  color:#ffc107;
  width: 100px;
  height: 100px;
}

a {
  background: #ffc107;
  color: var(--bg-color);
  transition: all .6s ease-in-out;
}

a:hover {
  background: #e4ac02;
}

</style>
