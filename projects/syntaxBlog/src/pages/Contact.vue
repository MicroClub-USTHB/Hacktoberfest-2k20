<template>
  <Layout>
    <div class="mt-16">
      <h1 class="text-3xl font-bold">اتصل بنا</h1>
      <p
        class="mt-4"
      >لديك إقتراحات لتحسين المدونة ؟ لديك ملاحظات حول المدونة و محتواها ؟ تود إقتراح بعض المواضيع التي تتطلع إلى وجودها في مدونة سينتاكس ؟ لديك أسئلة او إستفسارات عامة ؟ نحن أذن صاغية بإذن الله .</p>
      <p class="mt-4">يُمكنك التواصل معنا من خلال :</p>
      <ul class="mt-4 font-bold">
        <li class="my-2">
           - البريد الإلكتروني :
          <g-link to="mailto:example@gmail.com">example@gmail.com</g-link>
        </li>
        <li class="my-2">
           - حسابنا على تويتر :
          <g-link to="/">syntaxBlog</g-link>
        </li>
        <li class="my-2">
           - حسابنا على فيسبوك :
          <g-link to="/">syntaxBlog</g-link>
        </li>
      </ul>
    </div>
  </Layout>
</template>

<script>
export default {
  metaInfo: {
    title: "اتصل بنا",
  },
};
</script>

<style scoped>
h1 {
  color: var(--title-color);
}
a {
  color: #6fb451;
}
</style>
