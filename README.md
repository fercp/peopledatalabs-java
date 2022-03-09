<p align="center">
<img src="https://i.imgur.com/S7DkZtr.png" width="250" alt="People Data Labs Logo">
</p>
<h1 align="center">People Data Labs JAVA Library</h1>
<p align="center">
 Java client for the People Data Labs API.
</p>


# 
This is a simple Java client library to access the various API endpoints provided by [People Data Labs](https://www.peopledatalabs.com/).

This library bundles up PDL API requests into simple function calls, making it easy to integrate into your projects. You can use the various [API endpoints](#endpoints) to access up-to-date, real-world data from our massive [Person](https://docs.peopledatalabs.com/docs/stats) and [Company](https://docs.peopledatalabs.com/docs/company-stats) Datasets.

## ✨ Features
- Can be add easily into your existing maven,gradle projects


## Table of Contents
- [🔧 Configuration](#configuration)
- [🚀 Usage](#usage)
- [🌐 Endpoints](#endpoints)
- [📘 Documentation](#documentation)



## 🔧 Configuration <a name="configuration"></a>

1. Add maven dependency

```
<dependency>
  <groupId>com.fersoft</groupId>
  <artifactId>peopledatalabs-java</artifactId>
  <version>1.0-SNAPSHOT</version>
</dependency>
```

2. Sign up for a [free PDL API key](https://www.peopledatalabs.com/signup)

## 🚀 Usage <a name="usage"></a>

See usage from <b>TestPersonAPI</b> test class , !!! BEFORE RUNNING TESTS SET ** API_KEY *** !!!!!

```java
        PDLClient pdlClient = new PDLClient(BASE_PATH, VERSION, API_KEY);
        EnrichmentParams enrichmentParams = new EnrichmentParams();
        enrichmentParams.setEmail(Collections.singletonList("sean@peopledatalabs.com"));
        Person person = pdlClient.person();
        EnrichmentResponse response = person.enrich(enrichmentParams);
        assertThat(response.getData().getFirstName(), is(equalTo("sean")));
```
## 📘 Documentation <a name="documentation"></a>

All of our API endpoints are documented at: https://docs.peopledatalabs.com/

These docs describe the supported input parameters, output responses and also provide additional technical context. 
