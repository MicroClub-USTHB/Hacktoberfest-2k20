<template>
  <div>
    <span v-if="$page.allTutorial.totalCount == 0" class="text-sm md:text-xl">
      نعمل على توفير دروس جديدة ... شكرا لإهتمامك
    </span>
    <g-link v-else :to="tutorial.path">
      <li class="rounded hover:bg-gray-300 p-3 text-sm md:text-xl">
        {{ tutorial.title }}
      </li>
    </g-link>
  </div>
</template>

<script>
export default {
  props: ["tutorial"],
};
</script>

<style scoped>
span {
  color: #FF9800;
}
</style>>

</style>
