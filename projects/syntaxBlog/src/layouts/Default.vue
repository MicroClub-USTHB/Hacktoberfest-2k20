<template>
  <div class="layout">
    <headroom>
      <header class="header block text-center sm:flex sm:justify-between sm:items-center w-full md:w-base">
        <strong class="block my-6">
          <g-link to="/" class="logo text-xs md:text-base">{{ $static.metadata.siteName }}</g-link>
        </strong>
        <nav class="nav">
          <g-link class="nav__link px-1 text-base md:px-2" to="/posts/">مقالات </g-link>
          <g-link class="nav__link px-1 text-base md:px-2" to="/tutorials/">دروس </g-link>
          <g-link class="nav__link px-1 text-base md:px-2" to="/contact">اتصل بنا</g-link>
          <ToggleDarkMode class="align-middle mr-2 md:mr-6" data-cursor-hover>
            <template slot="default" slot-scope="{ dark }">
              <MoonIcon v-if="dark" />
              <SunIcon v-else />
            </template>
          </ToggleDarkMode>
        </nav>
      </header>
    </headroom>
    <slot />
    <footer class="text-xs sm:text-sm mt-16 mb-6">
      <div class="my-6 flex flex-wrap lg:flex-no-wrap justify-center lg:justify-between">
        <div class="footer__links self-center order-2 lg:order-1 w-full lg:text-right">
          <g-link to="/privacy-policy" class="footer__link">سياسة الخصوصية</g-link>
          <g-link to="/about" class="footer__link">عنا</g-link>
        </div>
        <div class="footer__socialmedia mb-4 lg:mb-0 w-full order-1 lg:order-2 lg:text-left">
          <g-link>
            <twitter-icon class="inline-block ml-2 w-4 sm:w-6"></twitter-icon>
          </g-link>
          <g-link>
            <facebook-icon class="inline-block ml-2 w-4 sm:w-6"></facebook-icon>
          </g-link>
          <g-link>
            <linkedin-icon class="inline-block ml-2 w-4 sm:w-6"></linkedin-icon>
          </g-link>
        </div>
      </div>
      <p>
        Created by <g-link to="https://xenodochial-yonath-b7c6a8.netlify.app/" class="font-bold">Oussama Djaidri</g-link>. Powered by
        <g-link to="https://gridsome.org/" class="font-bold underline"
          >Gridsome</g-link
        >
        &copy; 2020
      </p>
    </footer>
  </div>
</template>

<static-query>
query {
  metadata {
    siteName
  }
}
</static-query>

<script>
import ToggleDarkMode from "~/components/ToggleDarkMode";
import { headroom } from "vue-headroom";
import {
  SunIcon,
  MoonIcon,
  FacebookIcon,
  LinkedinIcon,
  TwitterIcon,
} from "vue-feather-icons";

export default {
  components: {
    ToggleDarkMode,
    SunIcon,
    MoonIcon,
    FacebookIcon,
    LinkedinIcon,
    TwitterIcon,
    headroom,
  },
};
</script>

<style>

/* .layout div:first-child {
  width: 100%;
} */

/*  bad code post styling */
.bad {
  background: var(--bad-code);
  padding: 50px;
}

.bad::before {
  content: "سيىء";
  color: #733232;
  font-weight: bold;
}

/*  good code post styling */
.good {
  background: var(--good-code);
  padding: 50px;
}

.good::before {
  content: "جيد";
  color: #556f38;
  font-weight: bold;
}


.headroom {
  width: 100%;
  background: var(--bg-color);
  transition: background-color .6s !important;
}

.headroom--top {
  box-shadow: none !important;
}

.headroom--not-top {
  transform: translate3d(0px, 0px, 0px) !important;
  width: 100% !important;
  position: fixed !important;
}

.headroom--not-top header {
  @apply px-2
}

.headroom--pinned {
  box-shadow: 1px 1px 18px #00000030;
  width: 100%;
}

.headroom--unpinned {
  transform: translate3d(0px, 0px, 0px) !important;
  box-shadow: 1px 1px 18px #00000030;
}

.headroom > header {
  margin: 0 auto 25px auto;
  transition: background-color .6s;
}

@screen sm {
  .headroom > header {
    margin: 0 auto 10px auto;
  }
}

/* change highlight selection color */
::-moz-selection {
  /* Code for Firefox */
  color: #111;
  background: #ffee5b;
}

::selection {
  color: #111;
  background: #ffee5b;
}

body {
  font-family: -apple-system, system-ui, BlinkMacSystemFont, "Segoe UI", Roboto,
    "Helvetica Neue", Arial, sans-serif;
  margin: 0;
  padding: 0;
}

.layout {
  max-width: 760px;
  margin: 0 auto;
  padding-left: 20px;
  padding-right: 20px;
}

.header {
  margin-bottom: 20px;
  height: 80px;
}

.header .logo {
  padding: 4px 7px;
  border-radius: 7px;
  position: relative;
  background: var(--text-color);
  color: var(--bg-color);
  z-index: 999;
  transition: all 0.3s ease-in;
}

.header .logo:hover {
  background: var(--logo-color);
}

.header .logo::after {
  content: " ";
  width: 100%;
  height: 100%;
  border: 2px solid var(--text-color);
  border-radius: 7px;
  position: absolute;
  right: 5px;
  top: 4px;
  z-index: -1;
}

.nav__link:hover {
  color: var(--text-hover);
}

footer {
  text-align: center;
}

.footer__link {
  margin-left: 20px;
}

.footer__links a:hover {
  color: #6fb451;
}

.footer__socialmedia a:hover {
  cursor: pointer;
  color: #6fb451;
}

footer p a:hover {
  cursor: pointer;
  color: #6fb451;
}

/* Single Post Styling */

.post__content hr {
  margin: 25px 0;
}

.post__content ul li {
  margin-bottom: 20px;
}

.post__content ul li span {
  margin-right: 15px;
}

.post__content ul li::before {
  content: " ";
  width: 7px;
  height: 7px;
  background: var(--title-color);
  display: inline-block;
  margin-left: 7px;
  border-radius: 50%;
}

.post__content p .note {
  background: var(--note-color);
  border-radius: 7px;
  padding: 0 25px;
  color: #8e8239;
}

.post__content p .explanation {
  color: #ff5722;
}

.post__content p img {
  margin: 40px 0;
  box-shadow: 3px 3px 18px #00000030;
}

.post__content p span strong {
  color: #896722;
}

.post__content h1 {
  color: var(--title-color);
}

.post__content h1:hover a::before {
  content: "#";
  margin-left: 10px;
}

#ext-link {
  color: #ff9800;
}

#ext-link:hover {
  color: #af6800;
}

/* oveeride font family (prismJs) */

/* change highlight selection color (prismJs) */
code[class*="language-"]::-moz-selection,
pre[class*="language-"]::-moz-selection,
code[class*="language-"] ::-moz-selection,
pre[class*="language-"] ::-moz-selection {
	background: #ffee5b !important;
}

code[class*="language-"]::selection,
pre[class*="language-"]::selection,
code[class*="language-"] ::selection,
pre[class*="language-"] ::selection {
	background: #ffee5b !important;
}

code[class*="language-"], pre[class*="language-"] {
  line-height: 1.8 !important;
  border-radius: 7px;
  text-align: left;
  direction: ltr !important;
  font-size: 20px !important;
}

.gridsome-code-title {
  position: relative;
  z-index: 100;
  margin-bottom: -0.8em;
  background-color: #feb;
  color: #607D8B;
  font-style: italic;
  font-weight: 100;
  text-align: center;
  font-family: PT Mono, Consolas, Monaco, "Andale Mono", "Ubuntu Mono", monospace;
  line-height: 1.5;
  border-top-left-radius: 0.3em;
  border-top-right-radius: 0.3em;
}


/* Responsive */

@screen md {
  .headroom--not-top header {
    @apply px-0
  }
}

</style>
