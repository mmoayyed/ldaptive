---
layout: default_v1
title: Ldaptive - persistent search
redirect_from: "/v1/docs/guide/controls/psearch/"
---

# Persistent Search

Request that the server keep a search operation open and send changes to the client. See [A Simple LDAP Change Notification Mechanism](http://tools.ietf.org/id/draft-ietf-ldapext-psearch-03.txt).

## Using the Persistent Search Client

{% highlight java %}
{% include source_v1/controls/psearch/1.java %}
{% endhighlight %}

## Provider Support

| JNDI | JLDAP | Apache LDAP | UnboundID | OpenDJ
| <font color="#cc0000">✗</font> | <font color="#6aa84f">✓</font> | <font color="#6aa84f">✓</font> | <font color="#6aa84f">✓</font> | <font color="#6aa84f">✓</font>

{% include provider-support-legend.md %}
