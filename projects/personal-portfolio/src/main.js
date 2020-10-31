// This is the main.js file. Import global CSS and scripts here.
// The Client API can be used here. Learn more: gridsome.org/docs/client-api

// main style
import "./assets/styles/main.scss";

// Tailwindcss styles
import "./assets/styles/tailwind.css";

import DefaultLayout from "~/layouts/Default.vue";

import "@luxdamore/vue-cursor-fx/dist/CursorFx.css";

import VueTypedJs from "vue-typed-js";

import VueScrollTo from "vue-scrollto";

export default function(Vue, { router, head, isClient }) {
  // Set default layout as a global component
  Vue.component("Layout", DefaultLayout);

  Vue.use(VueTypedJs);
  Vue.use(VueScrollTo);

  if (isClient) {
    Vue.component("cursor-fx", () =>
      import("@luxdamore/vue-cursor-fx").then((m) => m.CursorFx)
    );
    Vue.component("kinesis-container", () =>
      import("vue-kinesis").then((m) => m.KinesisContainer)
    );
    Vue.component("kinesis-element", () =>
      import("vue-kinesis").then((m) => m.KinesisElement)
    );
  }
}
