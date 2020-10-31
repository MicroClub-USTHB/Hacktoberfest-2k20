<template>
  <div>
    <div v-if="loading">
      <breeding-rhombus-spinner
        :animation-duration="2000"
        :size="100"
        color="#D0BB79"
      />
    </div>
    <div class="layout" v-else>
      <header class="header">
        <Logo data-cursor-hover />
        <div class="block md:hidden">
          <button
            @click="ShowMenu"
            :class="{ 'is-active': isActive }"
            class="hamburger hamburger--collapse"
            type="button"
            data-cursor-hover
          >
            <span class="hamburger-box">
              <span class="hamburger-inner"></span>
            </span>
          </button>
          <div id="HamMenu" :class="{ hidden: !isActive }">
            <nav class="nav flex flex-col">
              <g-link
                data-cursor-hover
                class="nav__link menu-span uppercase text-smallest tracking-widerPlus font-bold"
                to="/"
              >
                <span data-hover="home">home</span>
              </g-link>
              <g-link
                data-cursor-hover
                class="nav__link menu-span uppercase text-smallest tracking-widerPlus font-bold"
                v-scroll-to="'#about'"
              >
                <span data-hover="about">about</span>
              </g-link>
              <g-link
                data-cursor-hover
                class="nav__link menu-span uppercase text-smallest tracking-widerPlus font-bold"
                v-scroll-to="'#works'"
              >
                <span data-hover="works">works</span>
              </g-link>
              <g-link
                data-cursor-hover
                class="nav__link menu-span uppercase text-smallest tracking-widerPlus font-bold"
                v-scroll-to="'#services'"
              >
                <span data-hover="services">services</span>
              </g-link>
              <g-link
                data-cursor-hover
                class="nav__link menu-span uppercase text-smallest tracking-widerPlus font-bold"
                v-scroll-to="'#courses'"
              >
                <span data-hover="courses">courses</span>
              </g-link>
              <g-link
                data-cursor-hover
                class="nav__link menu-span uppercase text-smallest tracking-widerPlus font-bold"
                v-scroll-to="'#contact'"
              >
                <span data-hover="contact">contact</span>
              </g-link>
            </nav>
          </div>
          <ToggleDarkMode class="inline-block ml-2" data-cursor-hover>
            <template slot="default" slot-scope="{ dark }">
              <MoonIcon v-if="dark" />
              <SunIcon v-else />
            </template>
          </ToggleDarkMode>
        </div>
        <nav class="nav hidden md:block">
          <g-link
            data-cursor-hover
            class="nav__link menu-span uppercase text-smallest tracking-widerPlus font-bold"
            to="/"
          >
            <span data-hover="home">home</span>
          </g-link>
          <g-link
            data-cursor-hover
            class="nav__link menu-span uppercase text-smallest tracking-widerPlus font-bold"
            v-scroll-to="'#about'"
          >
            <span data-hover="about">about</span>
          </g-link>
          <g-link
            data-cursor-hover
            class="nav__link menu-span uppercase text-smallest tracking-widerPlus font-bold"
            v-scroll-to="'#works'"
          >
            <span data-hover="works">works</span>
          </g-link>
          <g-link
            data-cursor-hover
            class="nav__link menu-span uppercase text-smallest tracking-widerPlus font-bold"
            v-scroll-to="'#services'"
          >
            <span data-hover="services">services</span>
          </g-link>
          <g-link
            data-cursor-hover
            class="nav__link menu-span uppercase text-smallest tracking-widerPlus font-bold"
            v-scroll-to="'#courses'"
          >
            <span data-hover="courses">courses</span>
          </g-link>
          <g-link
            data-cursor-hover
            class="nav__link menu-span uppercase text-smallest tracking-widerPlus font-bold"
            v-scroll-to="'#contact'"
          >
            <span data-hover="contact">contact</span>
          </g-link>
          <ToggleDarkMode class="align-middle ml-6" data-cursor-hover>
            <template slot="default" slot-scope="{ dark }">
              <MoonIcon v-if="dark" />
              <SunIcon v-else />
            </template>
          </ToggleDarkMode>
        </nav>
      </header>
      <slot />
      <cursor-fx />
      <footer class="mb-5">
        <p class="mb-1">&copy; 2020 Oussama Djaidri. All rights reserved.</p>
        <p class="text-sm">
          Built with
          <span>Gridsome</span> & <span>Tailwindcss</span>.
        </p>
      </footer>
    </div>
  </div>
</template>

<script>
import Logo from "~/components/Logo.vue";
import ToggleDarkMode from "~/components/ToggleDarkMode";
import { SunIcon, MoonIcon, MenuIcon } from "vue-feather-icons";
import { BreedingRhombusSpinner } from "epic-spinners";

export default {
  components: {
    Logo,
    ToggleDarkMode,
    SunIcon,
    MoonIcon,
    BreedingRhombusSpinner,
    MenuIcon,
  },
  data() {
    return {
      loading: true,
      isActive: false,
    };
  },
  methods: {
    ShowMenu() {
      this.isActive = !this.isActive;
    },
  },
  mounted() {
    this.loading = false;
  },
};
</script>

<style>

#HamMenu {
  width: 100%;
  top: 15%;
  position: absolute;
  left: 0px;
  background: var(--bg-color);
  z-index: 9999;
  box-shadow: 0 5px 18px -12px var(--box-shadow);
  transition: all .8s ease-in-out;
}

#HamMenu nav a {
  padding: 15px 0;
  overflow: hidden;
}

/* hamburger Styling  */
.hamburger {
  padding: 5px;
  display: inline-block;
  cursor: pointer;
  transition-property: opacity, filter;
  transition-duration: 0.15s;
  transition-timing-function: linear;
  font: inherit;
  color: inherit;
  text-transform: none;
  background-color: transparent;
  border: 0;
  margin: 0;
  overflow: visible;
}
.hamburger:hover {
  opacity: 0.7;
}
.hamburger.is-active:hover {
  opacity: 0.7;
}
.hamburger.is-active .hamburger-inner,
.hamburger.is-active .hamburger-inner::before,
.hamburger.is-active .hamburger-inner::after {
  background-color: var(--title-color);
}

.hamburger-box {
  width: 25px;
  height: 25px;
  display: inline-block;
  position: relative;
}

.hamburger-inner {
  display: block;
  top: 50%;
  margin-top: -2px;
}
.hamburger-inner,
.hamburger-inner::before,
.hamburger-inner::after {
  width: 25px;
  height: 1.8px;
  background-color: var(--title-color);
  border-radius: 4px;
  position: absolute;
  transition-property: transform;
  transition-duration: 0.15s;
  transition-timing-function: ease;
}
.hamburger-inner::before,
.hamburger-inner::after {
  content: "";
  display: block;
}
.hamburger-inner::before {
  top: -10px;
}
.hamburger-inner::after {
  bottom: -10px;
}
.hamburger--collapse .hamburger-inner {
  top: auto;
  bottom: 0;
  transition-duration: 0.13s;
  transition-delay: 0.13s;
  transition-timing-function: cubic-bezier(0.55, 0.055, 0.675, 0.19);
}
.hamburger--collapse .hamburger-inner::after {
  top: -20px;
  transition: top 0.2s 0.2s cubic-bezier(0.33333, 0.66667, 0.66667, 1),
    opacity 0.1s linear;
}
.hamburger--collapse .hamburger-inner::before {
  transition: top 0.12s 0.2s cubic-bezier(0.33333, 0.66667, 0.66667, 1),
    transform 0.13s cubic-bezier(0.55, 0.055, 0.675, 0.19);
}
.hamburger--collapse.is-active .hamburger-inner {
  transform: translate3d(0, -10px, 0) rotate(-45deg);
  transition-delay: 0.22s;
  transition-timing-function: cubic-bezier(0.215, 0.61, 0.355, 1);
}
.hamburger--collapse.is-active .hamburger-inner::after {
  top: 0;
  opacity: 0;
  transition: top 0.2s cubic-bezier(0.33333, 0, 0.66667, 0.33333),
    opacity 0.1s 0.22s linear;
}
.hamburger--collapse.is-active .hamburger-inner::before {
  top: 0;
  transform: rotate(-90deg);
  transition: top 0.1s 0.16s cubic-bezier(0.33333, 0, 0.66667, 0.33333),
    transform 0.13s 0.25s cubic-bezier(0.215, 0.61, 0.355, 1);
}

/* Load Page Spinner */
.breeding-rhombus-spinner {
  position: absolute !important;
  top: 50%;
  z-index: 9999;
  left: 50%;
  transform: translate(-50%, -50%) !important;
}

/* customize scrollbar */
::-webkit-scrollbar {
  width: 10px;
  height: 10px;
}
::-webkit-scrollbar-track {
  -webkit-box-shadow: inset 0 0 6px var(--bg-color);
  -webkit-border-radius: 6px;
  border-radius: 6px;
}
::-webkit-scrollbar-thumb {
  -webkit-border-radius: 50px;
  border-radius: 50px;
  background: var(--special-color);
}
::-webkit-scrollbar-thumb:window-inactive {
  background: var(--title-color);
}

body {
  font-family: -apple-system, system-ui, BlinkMacSystemFont, "Segoe UI", Roboto,
    "Helvetica Neue", Arial, sans-serif;
  margin: 0;
  padding: 0;
  line-height: 1.5;
  overflow-x: hidden;
}

.layout {
  max-width: 1200px;
  margin: 0 auto;
  padding-left: 20px;
  padding-right: 20px;
}

.header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  margin-bottom: 20px;
  height: 80px;
}

.nav {
  overflow: hidden;
}

.nav__link {
  margin-left: 20px;
  transition: transform 500ms;
  -webkit-transition: -webkit-transform 500ms;
  -moz-transition: transform 500ms;
  position: relative;
}

.nav__link span {
  display: inline-block;
  position: relative;
  transition: transform 500ms;
  -webkit-transition: -webkit-transform 500ms;
  -moz-transition: transform 500ms;
}
.nav__link span::after {
  content: attr(data-hover);
  position: absolute;
  top: -30px;
  left: 0;
  transform: translate3d(0, 0, 0);
  -moz-transform: translate3d(0, 0, 0);
  -webkit-transform: translate3d(0, 0, 0);
  color: var(--special-color);
}

.nav__link:hover span,
.nav__link:focus span {
  transform: translateY(30px);
  -webkit-transform: translateY(30px);
  -moz-transform: translateY(30px);
}

svg {
  color: var(--title-color);
}

button:focus {
  outline: none;
}

.menu-span {
  color: var(--title-color);
}

#cursor-fx {
  color: var(--title-color) !important;
}

footer p span {
  color: var(--special-color);
  font-weight: bold;
}
</style>
