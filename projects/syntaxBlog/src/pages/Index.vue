<template>
  <Layout>
    <h1 class="text-4xl sm:text-5xl font-bold mt-4">سينتاكس</h1>

    <div class="blog-principle text-sm md:text-xl">
      <p class="mt-4">
        <q>
          إذا مُنع العلم عن العامة فلا خير فيه للخاصة -
          <span class="font-bold">أنس بن مالك</span>
        </q>
      </p>
      <p class="mt-4 max-w-md lg:max-w-lg">
        <q>
          شَرُّ القومِ قَوْمٌ مَرُّوُا بِأَرْضٍ فَلاَةٍ، فلما تمكن منهم الظمأ
          واستيأسوا من طلب الورد، أدركوا بئرا فشربوا منها حتى قضوا وطرهم، ووردوا
          إبلهم وملؤوا قرابهم، ثم طمروا البئر وواصلوا سفرهم لئلا ينتفع منها
          غيرهم، وما علموا أن لو سبقهم إليها أمثالهم لكانوا قد هلكوا عطشا. -
          <span class="font-bold">وصية مبرمج حكيم لإبنه (خالد السعداني)</span>
        </q>
      </p>
    </div>
    <latest-posts class="mt-10" />
    <latest-tutorials class="mt-10" />
  </Layout>
</template>

<page-query>
query {
  latestPost: allPost(sortBy: "date", order: DESC, limit: 5) {
    totalCount
    edges{
      node{
      	id
        title
        path
      }
    }
  }
  allTutorial{
    totalCount
  }
}
</page-query>

<script>
import LatestPosts from "~/components/LatestPosts.vue";
import LatestTutorials from "~/components/LatestTutorials.vue";
export default {
  metaInfo: {
    title: "الرئيسية",
  },
  components: {
    LatestPosts,
    LatestTutorials,
  },
};
</script>

<style>
.home-links a {
  margin-right: 1rem;
}

.blog-principle span {
  color: #6fb451;
}

</style>
