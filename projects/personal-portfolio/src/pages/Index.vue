<template>
  <Layout class="text-center">
    <div>
      <!-- header section -->
      <kinesis-container id="home" class="relative">
        <Profile class="h-full w-1/3 md:w-1/6 mt-8 mx-auto" />
        <div>
          <h1 class="text-3xl font-bold mt-2">Oussama Djaidri</h1>
          <vue-typed-js
            :strings="[
              'FullStack Developer',
              'Youtube Creator',
            ]"
            :typeSpeed="80"
            :loop="true"
            :showCursor="true"
            :cursorChar="'_'"
            :backSpeed="50"
            style="display: inline-block"
            class="my-3"
          >
            <span>
              I'm a
              <span class="typing"></span>
            </span>
          </vue-typed-js>
          <div class="social-media flex w-1/2 m-auto justify-center mt-3">
            <g-link data-cursor-hover>
              <linkedin-icon stroke-width="1.5" size="20" class="mx-2"></linkedin-icon>
            </g-link>
            <g-link data-cursor-hover>
              <github-icon stroke-width="1.5" size="20" class="mx-2"></github-icon>
            </g-link>
            <g-link data-cursor-hover>
              <twitter-icon stroke-width="1.5" size="20" class="mx-2"></twitter-icon>
            </g-link>
            <g-link data-cursor-hover>
              <youtube-icon stroke-width="1.5" size="20" class="mx-2"></youtube-icon>
            </g-link>
          </div>
        </div>
        <div class="hidden md:block">
          <kinesis-element class="absolute" style="top: 10%; left: 10%;" :strength="10">
            <svg
              width="60"
              height="60"
              viewBox="0 0 238 238"
              fill="none"
              xmlns="http://www.w3.org/2000/svg"
            >
              <path d="M156 155.982H0V-0.000495155H156V155.982Z" fill="#D0BB79" />
              <path
                d="M234.005 234.1H78.0054V78.0887H234.005V234.1Z"
                stroke="currentColor"
                stroke-width="6.6665"
                stroke-miterlimit="10"
                stroke-linecap="round"
                stroke-linejoin="round"
              />
            </svg>
          </kinesis-element>
          <kinesis-element class="absolute" style="top: 100%;right: 25%;" :strength="10">
            <svg
              width="80"
              height="80"
              viewBox="0 0 312 281"
              fill="none"
              xmlns="http://www.w3.org/2000/svg"
            >
              <path d="M81.2803 81.0007L196.224 280.115L311.196 81.0007H81.2803Z" fill="#D0BB79" />
              <path
                d="M4 3.99853L118.944 203.113L233.915 3.99853H4Z"
                stroke="currentColor"
                stroke-width="6.6665"
                stroke-miterlimit="10"
                stroke-linecap="round"
                stroke-linejoin="round"
              />
            </svg>
          </kinesis-element>
          <kinesis-element class="absolute" style="top: 3%; right: 15%;" :strength="10">
            <svg
              width="75"
              height="75"
              viewBox="0 0 201 161"
              fill="none"
              xmlns="http://www.w3.org/2000/svg"
            >
              <path
                d="M70.6787 64.8648C70.6787 29.0425 99.6937 -0.000370204 135.516 -0.000370204C171.338 -0.000370204 200.381 29.0425 200.381 64.8648C200.381 100.687 171.338 129.702 135.516 129.702C99.6937 129.702 70.6787 100.687 70.6787 64.8648Z"
                fill="#FF5A5A"
              />
              <path
                d="M4 92.2057C4 56.3834 33.0429 27.3684 68.8372 27.3684C104.659 27.3684 133.702 56.3834 133.702 92.2057C133.702 128.028 104.659 157.043 68.8372 157.043C33.0429 157.043 4 128.028 4 92.2057Z"
                stroke="currentColor"
                stroke-width="6.6665"
                stroke-miterlimit="10"
              />
            </svg>
          </kinesis-element>
          <kinesis-element class="absolute hidden lg:block" style="top: 52%; left: 28%;" :strength="10">
            <svg
              width="70"
              height="70"
              viewBox="0 0 515 356"
              fill="none"
              xmlns="http://www.w3.org/2000/svg"
            >
              <path
                d="M4 352.084L90.1997 265.901"
                stroke="currentColor"
                stroke-width="6.6667"
                stroke-miterlimit="10"
                stroke-linecap="round"
              />
              <path
                d="M4 265.869L90.1997 352.053"
                stroke="currentColor"
                stroke-width="6.6667"
                stroke-miterlimit="10"
                stroke-linecap="round"
              />
              <path
                d="M299.946 109.617C299.946 51.2888 347.234 4.00033 405.562 4.00033C463.89 4.00033 511.179 51.2888 511.179 109.617C511.179 167.945 463.89 215.233 405.562 215.233C347.234 215.233 299.946 167.945 299.946 109.617Z"
                stroke="#FF5A5A"
                stroke-width="6.66656"
                stroke-miterlimit="10"
              />
            </svg>
          </kinesis-element>
          <kinesis-element class="absolute" style="top: 100%; left: 23%;" :strength="10">
            <svg
              width="140"
              height="140"
              viewBox="0 0 512 92"
              fill="none"
              xmlns="http://www.w3.org/2000/svg"
              style="transform: rotate(45deg);"
            >
              <path
                d="M507.855 87.6985L424.166 4.00024L339.981 88.1738L255.796 4.00024L171.845 87.9232L88.1558 4.22208L4 88.3984"
                stroke="#7AB9DC"
                stroke-width="6.66668"
                stroke-miterlimit="10"
                stroke-linecap="round"
                stroke-linejoin="round"
              />
            </svg>
          </kinesis-element>
          <kinesis-element class="absolute" style="top: 54%; right: 0%;">
            <svg
              width="200"
              height="200"
              viewBox="0 0 903 379"
              fill="none"
              xmlns="http://www.w3.org/2000/svg"
            >
              <path
                d="M812.57 288.736L898.77 374.919"
                stroke="currentColor"
                stroke-width="6.6667"
                stroke-miterlimit="10"
                stroke-linecap="round"
              />
              <path
                d="M3.99976 222.536L33.3465 251.906C52.31 270.847 83.0635 270.847 102.03 251.906L117.521 236.409C136.491 217.436 167.244 217.436 186.211 236.409L201.695 251.873C220.658 270.847 251.412 270.847 270.382 251.873L285.625 236.637C304.592 217.663 335.345 217.663 354.312 236.637L369.322 251.646C388.292 270.619 419.045 270.619 438.012 251.646L463.564 226.078"
                stroke="#FFEE50"
                stroke-width="6.66667"
                stroke-miterlimit="10"
                stroke-linecap="round"
                stroke-linejoin="round"
              />
              <path
                d="M717.477 132.548L832.255 66.2572L717.477 -8.07734e-05V132.548Z"
                fill="#FF5A5A"
              />
            </svg>
          </kinesis-element>
          <kinesis-element class="absolute hidden lg:block" style="top: 40%; right: 25%;">
            <svg
              width="100"
              height="100"
              viewBox="0 0 341 332"
              fill="none"
              xmlns="http://www.w3.org/2000/svg"
            >
              <path
                d="M337.476 106.319V327.921H115.884V106.319H337.476Z"
                stroke="#7AB9DC"
                stroke-width="6.66639"
                stroke-miterlimit="10"
                stroke-linecap="round"
                stroke-linejoin="round"
              />
              <path
                d="M297.29 146.338V287.311H156.327V146.338H297.29Z"
                stroke="#7AB9DC"
                stroke-width="6.66668"
                stroke-miterlimit="10"
                stroke-linecap="round"
                stroke-linejoin="round"
              />
              <path
                d="M256.896 247.213H196.58V186.906H256.896V247.213Z"
                stroke="#7AB9DC"
                stroke-width="6.66652"
                stroke-miterlimit="10"
                stroke-linecap="round"
                stroke-linejoin="round"
              />
              <path
                d="M196.245 4.00006V196.241H4V4.00006H196.245Z"
                stroke="currentColor"
                stroke-width="6.66624"
                stroke-miterlimit="10"
                stroke-linecap="round"
                stroke-linejoin="round"
              />
            </svg>
          </kinesis-element>
          <kinesis-element class="absolute" style="top: 70%;" :strength="10">
            <svg
              width="100"
              height="100"
              viewBox="0 0 128 342"
              fill="none"
              xmlns="http://www.w3.org/2000/svg"
              style="transform: rotate(45deg);"
            >
              <path
                d="M4.24484 341.394C4.10256 330.708 8.11166 319.967 16.2693 311.821L41.8804 286.21C57.9223 270.168 57.9223 244.166 41.8804 228.124L16.0406 202.263C-0.00129513 186.222 -0.00129513 160.22 16.0406 144.178L42.1205 118.092C58.1596 102.05 58.1596 76.0483 42.1205 60.0064L16.0321 33.9208C7.02078 24.9095 3.07037 12.7455 4.18354 1"
                stroke="currentColor"
                stroke-width="6.6665"
                stroke-miterlimit="10"
              />
              <path
                d="M39.4531 341.394C39.3108 330.708 43.3199 319.967 51.4776 311.821L77.0887 286.21C93.1306 270.168 93.1306 244.166 77.0887 228.124L51.2487 202.263C35.2068 186.222 35.2068 160.22 51.2487 144.178L77.3286 118.092C93.3677 102.05 93.3677 76.0483 77.3286 60.0064L51.2404 33.9208C42.229 24.9095 38.2813 12.7455 39.3917 1"
                stroke="currentColor"
                stroke-width="6.6665"
                stroke-miterlimit="10"
              />
              <path
                d="M74.6894 341.394C74.5471 330.708 78.5563 319.967 86.7139 311.821L112.325 286.21C128.367 270.168 128.367 244.166 112.325 228.124L86.4852 202.263C70.4433 186.222 70.4433 160.22 86.4852 144.178L112.565 118.092C128.604 102.05 128.604 76.0483 112.565 60.0064L86.4767 33.9208C77.4654 24.9095 73.5177 12.7455 74.6281 1"
                stroke="currentColor"
                stroke-width="6.6665"
                stroke-miterlimit="10"
              />
            </svg>
          </kinesis-element>
        </div>
        <g-link
          data-cursor-hover 
          v-scroll-to="'#contact'"
          class="btn mt-8 font-bold py-2 px-8 rounded-full capitalize text-sm inline-block"
        >hire me</g-link>
        <div class="scroll-downs" v-scroll-to="'#about'" data-cursor-hover>
          <span>scroll down</span>
          <div class="mousey">
            <div class="scroller"></div>
          </div>
        </div>
      </kinesis-container>
      <!-- about section -->
      <div id="about" class="about-section pt-12 my-24 flex">
        <div class="w-full lg:w-3/5 about-section__left text-left">
          <h2 class="section-heading uppercase font-semibold underline">
            <span class="text-4xl font-bold mr-1 rounded-sm relative">a</span>bout me
          </h2>
          <h3 class="mt-12">Hello 👋 Welcome to my portfolio!</h3>
          <h4 class="text-3xl mt-2 md:mt-0 md:text-5xl">
            I'm
            <span class="capitalize text-5xl xl:text-6xl font-black">oussama djaidri</span>
          </h4>
          <p class="mt-4 text-md md:text-1xl max-w-sm md:max-w-xl">
            Fullstack developer from
            <span class="relative">Algeria</span>,
            passionate about
            <span class="middle-span relative">javascript</span>
            ecosystem,
            <br />focused on creating
            <span class="last-span relative">modern web apps</span>.
          </p>
          <g-link
            class="btn mr-auto mt-8 font-bold py-3 px-8 rounded-full capitalize text-sm inline-block"
            to="/works"
            data-cursor-hover
          >See My Works</g-link>
          <g-link
            class="btn-secondary ml-0 sm:ml-4 mr-auto mt-8 font-bold py-3 px-8 rounded-full capitalize text-sm inline-block"
            to="/about"
            data-cursor-hover
          >more about me</g-link>
        </div>
        <div class="hidden lg:block about-section__right self-center mt-12">
          <g-image src="~/assets/images/about-me.svg"></g-image>
        </div>
      </div>
      <!-- works section -->
      <div id="works" class="works-section my-24 text-left">
        <h2 class="section-heading uppercase font-semibold underline">
          <span class="text-4xl font-bold mr-1 rounded-sm relative">m</span>y work
        </h2>
        <!-- work-1 -->
        <div class="mt-20 card w-full xl:w-4/5 rounded-md mx-auto overflow-hidden">
          <div class="card-header work-1 h-64 overflow-hidden">
            <g-link data-cursor-hover>
              <g-image src="~/assets/images/work1.png"></g-image>
            </g-link>
          </div>
          <div class="card-content mx-4 md:mx-8 lg:mx-12 my-6">
            <div class="mb-4 md:mb-10">
              <h3 class="text-1xl md:text-2xl font-bold inline-block">Marvel - Portfolio Theme</h3>
              <span class="underline font-bold uppercase text-smallest ml-3" data-cursor-hover>
                see demo
                <external-link-icon class="inline-block"></external-link-icon>
              </span>
            </div>
            <div class="tags uppercase text-xs font-semibold mb-6">
              <span class="mr-2 p-1 md:p-2">#html5</span>
              <span class="mr-2 p-1 md:p-2">#css3</span>
              <span class="mr-2 p-1 md:p-2">#javascript</span>
              <span class="mr-2 p-1 md:p-2">#tailwindcss</span>
            </div>
            <p class="text-sm md:text-md">
              It’s time to create and inspire with
              <span>Marvel</span>, a stunning modern portfolio theme I created so you can showcase your work the way it truly deserves.
            </p>
          </div>
        </div>
        <!-- work-2 -->
        <div class="mt-12 card w-full xl:w-4/5 rounded-md mx-auto overflow-hidden">
          <div class="card-header work-2 h-64 overflow-hidden">
            <g-link data-cursor-hover>
              <g-image src="~/assets/images/work-2.png"></g-image>
            </g-link>
          </div>
          <div class="card-content mx-4 md:mx-8 lg:mx-12 my-6">
            <div class="mb-4 md:mb-10">
              <h3 class="text-1xl md:text-2xl font-bold inline-block">Magazee - Website Template</h3>
              <span class="underline font-bold uppercase text-smallest ml-3" data-cursor-hover>
                see demo
                <external-link-icon class="inline-block"></external-link-icon>
              </span>
            </div>
            <div class="tags uppercase text-xs font-semibold mb-6">
              <span class="mr-2 p-1 md:p-2">#html5</span>
              <span class="mr-2 p-1 md:p-2">#css3</span>
            </div>
            <p class="text-sm md:text-md">Responsive, progressive web app for magazine websites.</p>
          </div>
        </div>
        <!-- more works -->
        <div class="text-center mt-16 more-works inline-block w-48 relative">
          <div class="circle"></div>
          <g-link data-cursor-hover to="/works" class="uppercase text-md font-light relative">
            see more
            <span class="text-lg">&#8594;</span>
          </g-link>
        </div>
        <!-- let's work together -->
        <div class="mt-16 text-center">
          <h3 class="text-2xlPlus sm:text-3xl md:text-4xl lg:text-5xl font-bold">
            Like my works? Let's work together,
            <br />You can contact me now!
          </h3>
          <g-link
            class="btn mr-auto mt-8 font-bold py-3 px-8 rounded-sm text-sm inline-block uppercase"
            v-scroll-to="'#contact'"
            data-cursor-hover
          >contact</g-link>
        </div>
      </div>
      <!-- services section -->
      <div id="services" class="services-section my-24">
        <h2 class="text-left section-heading uppercase font-semibold underline">
          <span class="text-4xl font-bold mr-1 rounded-sm relative">s</span>ervices
        </h2>
        <div class="content-section flex mt-20 justify-around">
          <div class="left-section w-full lg:w-3/5 text-left">
            <h3 class="text-2xl capitalize font-bold mb-8">what i can do.</h3>
            <div class="all-services">
              <div class="ml-0 lg:ml-1">
                <h4 class="underline font-bold">Web Development</h4>
                <p
                  class="mt-3 text-sm"
                >I know how to create your website to run across devices using the latest technologies available.</p>
              </div>
              <div class="ml-0 lg:ml-1 mt-4">
                <h4 class="underline font-bold">Mobile Development</h4>
                <p class="mt-3 text-sm">
                  I love to build mobile apps runs on both android & iOS using latest technologies such as
                  <span>flutter</span>.
                </p>
              </div>
              <div class="ml-0 lg:ml-1 mt-4">
                <h4 class="underline font-bold">Other Services</h4>
                <p class="mt-3 text-sm">Fix bugs - App improvements - Help/Consultation</p>
              </div>
            </div>
          </div>
          <div class="hidden lg:block right-section">
            <g-image src="~/assets/images/illustration-2.svg"></g-image>
          </div>
        </div>
      </div>
      <!-- courses section -->
      <div id="courses" class="courses-section my-24 text-center">
        <h3 class="mb-6 text-3xl font-bold">
          I create videos on
          <g-link to="https://www.youtube.com/c/algorithmCoding" data-cursor-hover>YouTube</g-link>
        </h3>
        <p
          class="max-w-xl mx-auto text-sm md:text-md"
        >Over the last year, I've created courses on Web Development, Python, Golang, and more. I love being able to put the things I've learned into a package for others to learn from.</p>
        <div class="mt-6 max-w-xl mx-auto">
          <h3 class="text-2xl mb-6 font-bold">Looking for Custom Content?</h3>
          <p class="text-sm md:text-md">I often get requests to create custom content like individual courses, one-off videos, articles, etc. If you're interested in something,contact me and include all of the necessary details.</p>
          <g-link
            class="btn mr-auto mt-8 font-bold py-3 px-8 rounded-sm text-sm inline-block uppercase"
            v-scroll-to="'#contact'"
            data-cursor-hover
          >contact</g-link>
        </div>
      </div>
      <!-- contact section -->
      <dir id="contact" class="contact-section p-0">
        <div class="contact-header mb-8">
          <span class="uppercase font-bold text-xs">get in touch</span>
          <h3 class="font-bold text-6xl uppercase">contact</h3>
        </div>
        <div class="contact-content flex flex-wrap">
          <div class="contact-info w-full flex flex-wrap lg:flex-no-wrap justify-around">
            <span class="text-sm w-1/2 mb-4">
              <mail-icon class="inline align-text-bottom"></mail-icon>
              odjaidri@gmail.com
            </span>
            <span class="text-sm w-1/2 mb-4">
              <phone-icon class="inline align-text-bottom"></phone-icon>
              +213 666-35-83-89
            </span>
            <span class="text-sm w-1/2">
              <map-pin-icon class="inline align-text-bottom"></map-pin-icon>
              address: Sétif, Algeria
            </span>
            <span class="text-sm w-1/2">
              <smile-icon class="inline align-text-bottom"></smile-icon>
              freelancer : <span class="freelancer font-bold">available</span>
            </span>
          </div>
          <div class="contact-form mt-1 w-full sm:w-11/12 md:w-5/6 lg:w-full sm:mx-auto flex p-4">
            <form class="w-full lg:w-1/2 p-2 lg:p-6">
              <input class="w-full border mb-4 p-4 rounded" type="text" name="name" placeholder="Your Name" autocomplete="off">
              <input class="w-full border mb-4 p-4 rounded" type="email" name="email" placeholder="Your Email" autocomplete="off">
              <input class="w-full border mb-4 p-4 rounded" type="text" name="subject" placeholder="Subject" autocomplete="off">
              <textarea class="w-full border rounded p-4" name="details" cols="24" rows="5" placeholder="Additional Details"></textarea>
              <button data-cursor-hover class="mt-4 font-bold py-3 px-8 rounded text-sm inline-block uppercase">send</button>
            </form>
            <div class="hidden lg:block w-1/2 p-4">
              <g-image src="~/assets/images/contactme.svg"></g-image>
            </div>
          </div>
        </div>
      </dir>
    </div>
  </Layout>
</template>

<script>
import Profile from "~/components/Profile.vue";
import {
  LinkedinIcon,
  GithubIcon,
  TwitterIcon,
  YoutubeIcon,
  MailIcon,
  PhoneIcon,
  MapPinIcon,
  SmileIcon,
  ExternalLinkIcon,
} from "vue-feather-icons";

export default {
  metaInfo: {
    title: "Home",
  },
  components: {
    Profile,
    LinkedinIcon,
    GithubIcon,
    TwitterIcon,
    YoutubeIcon,
    MailIcon,
    PhoneIcon,
    MapPinIcon,
    SmileIcon,
    ExternalLinkIcon,
  },
};
</script>

<style>

.home-links a {
  margin-right: 1rem;
}

.profile__image {
  margin: 3rem auto 0;
}

.social-media a svg {
  transition: all 0.5s;
}

.social-media a svg:hover {
  color: var(--special-color);
}

.btn {
  background: var(--special-color);
  color: #fff;
  border: 2px solid var(--special-color);
  transition: all 0.5s ease-in-out;
}

.btn:hover,
.btn:focus {
  background: var(--bg-color);
  color: var(--special-color);
}

.btn-secondary {
  background: var(--bg-color);
  color: var(--special-color);
  border: 2px solid var(--special-color);
  transition: all 0.5s ease-in-out;
}

.btn-secondary:hover,
.btn-secondary:focus {
  background: var(--special-color);
  color: #fff;
}

/* scroller */
.scroll-downs {
  position: absolute;
  top: 125%;
  right: 0;
  bottom: 0;
  left: 0;
  margin: auto;
  width: 60px;
  height: 60px;
}

.scroll-downs span {
  font-size: 11px;
  text-transform: capitalize;
  color: var(--title-color);
}

.mousey {
  width: 3px;
  padding: 3px 6px;
  height: 20px;
  border: 2px solid var(--title-color);
  border-radius: 25px;
  opacity: 0.75;
  box-sizing: content-box;
  margin: 2px auto;
}
.scroller {
  width: 3px;
  height: 10px;
  border-radius: 25%;
  background-color: var(--title-color);
  animation-name: scroll;
  animation-duration: 2.2s;
  animation-timing-function: cubic-bezier(0.15, 0.41, 0.69, 0.94);
  animation-iteration-count: infinite;
}
@keyframes scroll {
  0% {
    opacity: 0;
  }
  10% {
    transform: translateY(0);
    opacity: 1;
  }
  100% {
    transform: translateY(15px);
    opacity: 0;
  }
}

/* about section */
.section-heading {
  color: var(--title-color);
}

.section-heading span {
  background: var(--special-color);
  padding: 5px 10px;
  color: var(--bg-color);
}

.section-heading span::before {
  content: " ";
  width: 100%;
  height: 100%;
  background: var(--title-color);
  position: absolute;
  top: 5px;
  opacity: 0.9;
  left: -5px;
  z-index: -1;
  border-radius: 3px;
}

.about-section .about-section__left p span::after {
  content: " ";
  width: 84px;
  height: 10px;
  position: absolute;
  bottom: 0px;
  background: var(--special-color);
  right: 0;
  z-index: -1;
  opacity: 0.5;
}

.about-section .about-section__left p .middle-span::after {
  width: 110px;
}

.about-section .about-section__left p .last-span::after {
  width: 210px;
}

/* my works section */

.works-section .card {
  box-shadow: 1px 1px 18px var(--box-shadow);
  background: var(--card-color);
}

.works-section .card .card-header img {
  max-width: 100%;
  cursor: pointer;
}

.works-section .card .work-1:hover img {
  animation: moveSlideshow1 3s ease-in-out forwards;
}

.works-section .card .work-2:hover img {
  animation: moveSlideshow2 3s ease-in-out forwards;
}

@keyframes moveSlideshow1 {
  100% {
    transform: translateY(-74%);
  }
}

@screen lg {
  @keyframes moveSlideshow1 {
    100% {
      transform: translateY(-87%);
    }
  }
}

@screen xl {
  @keyframes moveSlideshow1 {
    100% {
      transform: translateY(-84.5%);
    }
  }
}

@keyframes moveSlideshow2 {
  100% {
    transform: translateY(-76.2%);
  }
}

@screen lg {
  @keyframes moveSlideshow2 {
    100% {
      transform: translateY(-88.5%);
    }
  }
}

@screen xl {
  @keyframes moveSlideshow2 {
    100% {
      transform: translateY(-87%);
    }
  }
}

.works-section .card .card-content div span svg {
  vertical-align: sub;
  width: 18px;
  color: var(--body-color);
  position: relative;
  top: 3px;
}

.works-section .card .card-content .tags span {
  background: var(--tags-bg-color);
  color: var(--special-color);
}

.works-section .circle {
  width: 45px;
  height: 45px;
  background: var(--special-color);
  display: inline-block;
  border-radius: 50px;
  left: 0%;
  position: absolute;
  transition: all 0.5s ease-in-out;
  top: -30%;
}

@screen sm {
  .works-section .circle {
    left: 4%;
    top: -16%;
  }
}

@screen md {
  .works-section .circle {
    left: 4%;
    top: -15%;
  }
}

@screen lg {
  .works-section .circle {
    left: 4%;
    top: -12%;
  }
}

.more-works:hover .circle {
  width: 210px;
}

.more-works:hover a {
  color: var(--bg-color);
}

.more-works {
  left: 50%;
  transform: translateX(-50%);
}

/* services section */
.services-section .content-section .left-section .all-services p span {
  color: var(--special-color);
  font-weight: bold;
}

/* courses section */

.courses-section h3 a {
  color: var(--special-color);
  text-decoration: underline;
  cursor: pointer;
}

/* contact section */

.contact-section .contact-header span::after {
  content: " ";
  width: 20px;
  height: 2px;
  background: var(--body-color);
  display: inline-block;
  position: relative;
  top: -4px;
  left: 5px;
}

.contact-info span .freelancer {
  color: var(--special-color);
}

.contact-form form input,
.contact-form form textarea {
  background: var(--bg-color);
  border: 2px solid var(--title-color);
  transition: all .2s ease-in-out;
}

.contact-form form input:focus,
.contact-form form textarea:focus {
  box-shadow: none;
  outline: none;
  border: 2px solid var(--special-color);
}

.contact-form form button {
  background: var(--special-color);
  color: #fff;
  border: 2px solid var(--special-color);
  transition: all 0.5s ease-in-out;
}

.contact-form form button:hover,
.contact-form form button:focus {
  background: var(--bg-color);
  color: var(--special-color);
}


</style>
