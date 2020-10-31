<template>
  <button @click="handleClick" aria-label="Toggle Darkmode" title="Toggle Darkmode">
    <slot :dark="isDarkMode" />
  </button>
</template>

<script>
export const LIGHTS_OUT = 'lights-out';
export default {
  data() {
    return {
      isDarkMode: false
    }
  },
  methods: {
    handleClick() {
      const body = document.getElementsByTagName("BODY")[0];
      const hasDarkMode = body.hasAttribute(LIGHTS_OUT);
      // Toggle dark mode on click.
      return this.toggleDarkMode(! hasDarkMode);
    },
    toggleDarkMode(shouldBeDark) {
      const body = document.getElementsByTagName("BODY")[0];
      body.toggleAttribute(LIGHTS_OUT, shouldBeDark);
      this.isDarkMode = shouldBeDark;
      this.writeToStorage(shouldBeDark);
      return shouldBeDark;
    },
    detectPrefered() {
      return window.matchMedia('(prefers-color-scheme: dark)').matches;
    },
    hasInStorage() {
      const check = process.isClient ? localStorage.getItem(LIGHTS_OUT) : false;
      return check !== null;
    },
    writeToStorage(prefersDark) {
      process.isClient ? localStorage.setItem(LIGHTS_OUT, prefersDark ? 'true' : 'false') : false;
    },
    getFromStorage() {
      return process.isClient ? (localStorage.getItem(LIGHTS_OUT) === 'true' ? true : false) : false;
    }
  },
  mounted() {
    if (this.hasInStorage()) {
      this.toggleDarkMode(
        this.getFromStorage()
      );
    } else if (process.isClient && window.matchMedia) {
      this.toggleDarkMode(
        this.detectPrefered()
      );
    }
  }
};
</script>
