package grace.guides

import grails.plugins.*
import grails.util.Environment

class BlogAdminGrailsPlugin extends DynamicPlugin {

    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2022.1.0 > *"
    def version = "1.0"
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    def title = "Grace Blog Admin Console"
    def author = "Michael Yan"
    def authorEmail = "rain@rainboyan.com"
    def description = '''\
Grace Blog Admin Console.
'''
    def profiles = ['web']

    Closure doWithSpring() { {->
            // TODO Implement runtime spring config (optional)
        }
    }

    void doWithDynamicMethods() {
        // TODO Implement registering dynamic methods to classes (optional)
    }

    void doWithDynamicModules() {
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
    }

}
