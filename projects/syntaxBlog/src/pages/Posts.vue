<template>
  <Layout>
    <div class="mt-16">
      <h1 class="text-2xl sm:text-3xl mb-4 font-bold">مقالات</h1>
      <!-- List blog posts -->
      <div class="posts">
        <transition-group name="fade" tag="ul" class="mb-6">
          <li
            class="rounded py-2 text-sm md:text-lg cursor-pointer"
            v-for="{ node } of loadedPosts"
            :key="node.id"
          >
            <span class="date text-xs font-bold italic">{{ node.date }} / </span
            ><g-link :to="node.path">{{ node.title }}</g-link>
          </li>
        </transition-group>
        <ClientOnly>
          <infinite-loading @infinite="infiniteHandler" spinner="spiral">
            <div slot="no-more">
              لقد قمت بالمرور على جميع المقالات الموجودة ;)
            </div>
            <div slot="no-results">
              آسف, لا مقالات لحد الآن :(
            </div>
          </infinite-loading>
        </ClientOnly>
      </div>
    </div>
  </Layout>
</template>

<page-query>
query ($page: Int) {
  posts: allPost(perPage: 10, page: $page) @paginate {
    totalCount
    pageInfo {
      totalPages
      currentPage
    }
    edges {
      node {
        id
        title
        path
        date(format: "YYYY-MM-DD")
      }
    }
  }
}
</page-query>

<script>
export default {
  props: ["posts"],
  data() {
    return {
      loadedPosts: [],
      currentPage: 1,
    };
  },
  created() {
    this.loadedPosts.push(...this.$page.posts.edges);
  },
  methods: {
    async infiniteHandler($state) {
      if (this.currentPage + 1 > this.$page.posts.pageInfo.totalPages) {
        if (this.$page.posts.pageInfo.totalPages == 1) {
          $state.loaded();
        }
        $state.complete();
      } else {
        const { data } = await this.$fetch(`/posts/${this.currentPage + 1}`);
        if (data.posts.edges.length) {
          this.currentPage = data.posts.pageInfo.currentPage;
          this.loadedPosts.push(...data.posts.edges);
          $state.loaded();
        } else {
          $state.complete();
        }
      }
    },
  },
};
</script>

<style scoped>
.date::before {
  content: " ";
  width: 10px;
  height: 10px;
  background: #6fb451;
  display: inline-block;
  margin-left: 7px;
  border-radius: 50px;
}

.fade-enter-active,
.fade-leave-active {
  transition: ease opacity 0.3s;
}
.fade-enter,
.fade-leave-to {
  opacity: 0;
}

.posts ul li:hover {
  background-color: var(--link-hover-bg);
}
</style>
