<template>
  <div>
    <div class="latestPosts__header">
      <h2 class="text-lg md:text-xl font-bold inline-block ml-4">
        <coffee-icon class="inline ml-1 w-4"></coffee-icon>آخر المقالات
      </h2>
      <g-link to="/posts" class="inline-block text-xs p-1 rounded">شاهد الكل</g-link>
    </div>
    <div class="latestPosts__content mt-6">
      <ul>
        <post-list v-for="edge in $page.latestPost.edges" :key="edge.node.id" :post="edge.node" />
      </ul>
    </div>
  </div>
</template>

<script>
import { CoffeeIcon } from "vue-feather-icons";
import PostList from "./PostList.vue";
export default {
  components: {
    CoffeeIcon,
    PostList,
  },
};
</script>

<style>
.latestPosts__header h2 {
  color: var(--title-color);
}

.latestPosts__header a {
  background: var(--link-bg);
  color: var(--link-color);
  transition: all 0.3s ease-in-out;
}

.latestPosts__header a:hover {
  background: var(--link-hover-bg);
}

.latestPosts__content ul li:hover {
  background: var(--each-color);
  cursor: pointer;
}
</style>
