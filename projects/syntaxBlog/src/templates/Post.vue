<template>
  <Layout>
    <div class="mt-16">
      <div class="text-center">
        <h1 class="post__title text-2xl sm:text-3xl mb-4">{{ $page.post.title }}</h1>
        <div class="post__time text-smallest sm:text-xs">
          <span>{{ moment($page.post.date).format("MMMM Do, YYYY") }}</span> |
          <span class="font-bold">{{ $page.post.timeToRead }} min read</span>
        </div>
        <div class="post__author text-smallest sm:text-xs">
          Posted by<span class="font-bold"> {{ $page.post.author }} </span>
        </div>
        <div class="post__tags mt-4 text-smallest sm:text-xs">
          <span
            class="px-1 rounded mx-1"
            v-for="tag in $page.post.tags"
            :key="tag"
          >
            {{ tag }}
          </span>
        </div>
        <div class="mt-12" v-if="$page.post.demoUrl || $page.post.codeUrl">
          <g-link class="mx-2 btn btn-demo rounded-full px-8" :to="$page.post.demoUrl" v-if="$page.post.demoUrl">معاينة</g-link>
          <g-link class="mx-2 btn btn-code rounded-full px-8" :to="$page.post.codeUrl" v-if="$page.post.codeUrl">الكود</g-link>
        </div>
      </div>
      <div class="table-of-contents mt-16" v-if="$page.post.tableOfContent.length">
        <h3 class="font-bold text-lg mb-4"># جدول المحتويات :</h3>
        <ul>
          <li class="my-1 item-of-content text-sm" v-for="(item, index) in $page.post.tableOfContent" :key="item"><a :href="'#toc'+index">{{ item }}</a></li>
        </ul>
      </div>
      <div class="post__content mt-10 sm:mt-16 break-words text-lg md:text-md" v-html="$page.post.content">
      </div>
    </div>
  </Layout>
</template>

<page-query>
query Post ($path: String!) {
   post: post (path: $path) {
    title
    date
    timeToRead
    tags
    content
    author
    tableOfContent
    description
    demoUrl
    codeUrl
  }
}
</page-query>

<script>

export default {
  metaInfo() {
    const title = this.$page.post.title;
    const description = this.$page.post.description;

    return {
      title: title,
      meta: [
        {
          name: 'description',
          content: description
        },
        {
          key: 'og:title',
          name: 'og:title',
          content: title,
        },
        {
          key: 'twitter:title',
          name: 'twitter:title',
          content: title,
        },
        {
          key: 'og:description',
          name: 'og:description',
          content: description,
        },
        {
          key: 'twitter:description',
          name: 'twitter:description',
          content: description,
        },
      ]
    }
  }
};
</script>

<style scoped>

h1 {
  color: var(--title-color);
}

.btn {
  color: #fff;
}

.btn-code {
  background: #ff5722;
}

.btn-demo {
  background: #8BC34A;
}

.post__tags span {
  background: var(--link-bg);
  color: var(--link-color);
  transition: all 0.3s ease-in-out;
}

.item-of-content:hover {
  color: #6fb451;
}

.item-of-content::before {
  content: " ";
  width: 7px;
  height: 7px;
  background: #6fb451;
  display: inline-block;
  margin-left: 7px;
  border-radius: 50%;
}

</style>
