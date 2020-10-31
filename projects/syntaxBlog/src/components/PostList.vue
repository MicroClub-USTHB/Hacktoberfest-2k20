<template>
  <div>
    <span
      v-if="$page.latestPost.totalCount == 0"
      class="text-sm md:text-xl"
    >نعمل على كتابة مقالات ... شكرا لإهتمامك</span>
    <g-link v-else :to="post.path">
      <li class="rounded hover:bg-gray-300 p-3 text-sm md:text-xl">{{ post.title }}</li>
    </g-link>
  </div>
</template>

<script>
export default {
  props: ["post"],
};
</script>

<style scoped>
span {
  color: #ff9800;
}
</style>
