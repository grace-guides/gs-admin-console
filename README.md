[![Main branch build status](https://github.com/grace-guides/gs-admin-console/workflows/Grace%20CI/badge.svg?style=flat)](https://github.com/grace-guides/gs-admin-console/actions?query=workflow%3A%Grace+CI%22)
[![Apache 2.0 license](https://img.shields.io/badge/License-APACHE%202.0-green.svg?logo=APACHE&style=flat)](https://opensource.org/licenses/Apache-2.0)
[![Grace on X](https://img.shields.io/twitter/follow/graceframework?style=social)](https://x.com/graceframework)

[![Groovy Version](https://img.shields.io/badge/Groovy-4.0.33-blue?style=flat&color=4298b8)](https://groovy-lang.org/releasenotes/groovy-4.0.html)
[![Grace Version](https://img.shields.io/badge/Grace-2024.2.0-blue?style=flat&color=f49b06)](https://github.com/graceframework/grace-framework/releases/tag/v2024.2.0)
[![Spring Boot Version](https://img.shields.io/badge/Spring_Boot-3.5.16-blue?style=flat&color=6db33f)](https://github.com/spring-projects/spring-boot/releases/tag/v3.5.16)

# Admin Console

This guide walks you through the process of creating a powerful and flexible, extensible administration framework and management console for your Grace application.

## Versions

* Grace 2024.2.0

## Using admin plugin

### Add admin and dynamic-modules plugins

Add `grace-plugin-dynamic-modules` and `grace-plugin-admin` in the `build.gradle`,

```groovy
    implementation "org.graceframework:grace-plugin-admin"
    implementation "org.graceframework:grace-plugin-dynamic-modules"
```

### Create a dynamic plugin

Create a dynamic plugin - `BlogAdminGrailsPlugin` in the `app/plugins`, and register dynamic modules for your blog menus.

```groovy

class BlogAdminGrailsPlugin extends DynamicPlugin {

    def title = "Grace Blog Admin Console"

    Closure doWithDynamicModules() { {->
        // TODO Implement registering dynamic modules to application (optional)
        webSection(key: "admin.tabs.blog", name: "Blog Tab", location: "admin.navigation.bar", i18nNameKey: "admin.menu.section.blog.name", descriptionKey: "admin.menu.section.blog.desc", weight: 20)

            webSection(key: "admin.sidebars.blog", name: "Blog", location: "admin.tabs.blog", i18nNameKey: "admin.menu.sidebars.blog.name", descriptionKey: "admin.menu.sidebars.blog.desc")

                webItem(key: "posts", name: "Posts", section: "admin.tabs.blog/admin.sidebars.blog", i18nNameKey: "admin.menu.item.posts.name", weight: 10) {
                    // label(key: "admin.menu.item.posts.label")
                    link(linkId: "post_index", url: [namespace: 'admin', controller: 'post', action: 'index'])
                }
                webItem(key: "newpost", name: "New Post", section: "admin.tabs.blog/admin.sidebars.blog", i18nNameKey: "admin.menu.item.posts.name", weight: 11) {
                    // label(key: "admin.menu.item.createpost.label")
                    link(linkId: "post_create", url: [namespace: 'admin', controller: 'post', action: 'create'])
                }
    }}

}

```


## Links

- [Grace Framework](https://github.com/graceframework/grace-framework)
- [Grace Plugins](https://github.com/grace-plugins)
- [Grace Guides](https://github.com/grace-guides)
