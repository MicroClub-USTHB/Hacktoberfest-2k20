// This is where project configuration and plugin options are located.
// Learn more: https://gridsome.org/docs/config

// Changes here require a server restart.
// To restart press CTRL + C in terminal and run `gridsome develop`

const tailwindcss = require("tailwindcss");

module.exports = {
  siteName: "مدونة سينتاكس",
  plugins: [
    {
      use: "@gridsome/source-filesystem",
      options: {
        path: "content/posts/**/*.md",
        typeName: "Post",
        remark: {
          plugins: [
            "gridsome-plugin-remark-prismjs-all",
            [
              "remark-attr",
              {
                enableAtxHeaderInline: true,
              },
            ],
          ],
        },
      },
    },
    {
      use: "@gridsome/source-filesystem",
      options: {
        path: "content/tutorials/**/*.md",
        typeName: "Tutorial",
        path: "./content/tutorials/**/*.md",
      },
    },
    {
      use: "@gridsome/source-filesystem",
      options: {
        path: "content/courses/**/*.md",
        typeName: "Course",
        path: "./content/courses/**/*.md",
      },
    },
  ],
  templates: {
    Post: "/posts/:urlParam",
    Tutorial: "/tutorials/:urlParam",
    Course: "/courses/:urlParam",
  },
  css: {
    loaderOptions: {
      postcss: {
        plugins: [tailwindcss],
      },
    },
  },
  permalinks: {
    trailingSlash: false,
  },
};
