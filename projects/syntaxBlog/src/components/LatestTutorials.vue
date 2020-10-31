<template>
  <div>
    <div class="latestTutorials__header">
      <h2 class="text-lg md:text-xl font-bold inline-block ml-4"><feather-icon class="inline ml-1 w-4"></feather-icon>آخر الدروس</h2>
      <g-link to="/tutorials" class="inline-block text-xs p-1 rounded">شاهد الكل</g-link>
    </div>
    <div class="latestTutorials__content mt-6">
      <ul>
        <tutorial-list tutorial="" />
      </ul>
    </div>
  </div>
</template>

<script>
import { FeatherIcon } from "vue-feather-icons";
import TutorialList from "./TutorialList.vue";
export default {
  components: {
    FeatherIcon,
    TutorialList
  },
};
</script>

<style>
.latestTutorials__header h2 {
  color: var(--title-color);
}

.latestTutorials__header a {
  background: var(--link-bg);
  color: var(--link-color);
  transition: all 0.3s ease-in-out;
}

.latestTutorials__header a:hover {
  background: var(--link-hover-bg);
}

.latestTutorials__content ul li:hover {
  background: var(--each-color);
  cursor: pointer;
}

</style>
