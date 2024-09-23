"use strict";(self.webpackChunkdocs=self.webpackChunkdocs||[]).push([[588],{9322:(e,n,t)=>{t.r(n),t.d(n,{assets:()=>l,contentTitle:()=>s,default:()=>p,frontMatter:()=>o,metadata:()=>r,toc:()=>c});var i=t(4848),a=t(8453);const o={sidebar_position:4,title:"Deployment",description:"Aristotle deployment guide"},s=void 0,r={id:"deployment",title:"Deployment",description:"Aristotle deployment guide",source:"@site/docs/deployment.md",sourceDirName:".",slug:"/deployment",permalink:"/docs/deployment",draft:!1,unlisted:!1,editUrl:"https://github.com/paion-data/aristotle/tree/master/docs/docs/deployment.md",tags:[],version:"current",sidebarPosition:4,frontMatter:{sidebar_position:4,title:"Deployment",description:"Aristotle deployment guide"},sidebar:"tutorialSidebar",previous:{title:"Configuration",permalink:"/docs/configuration"}},l={},c=[{value:"Prepare for Production Development",id:"prepare-for-production-development",level:2},{value:"Installing Java (on Ubuntu)",id:"installing-java-on-ubuntu",level:3},{value:"Installing Maven",id:"installing-maven",level:3},{value:"Packaging Aristotle",id:"packaging-aristotle",level:3},{value:"Running the JAR Package",id:"running-the-jar-package",level:3},{value:"Getting OpenAPI Documentation",id:"getting-openapi-documentation",level:3}];function d(e){const n={a:"a",code:"code",h2:"h2",h3:"h3",p:"p",pre:"pre",strong:"strong",...(0,a.R)(),...e.components};return(0,i.jsxs)(i.Fragment,{children:[(0,i.jsxs)(n.p,{children:["This section discusses deploying ",(0,i.jsx)(n.a,{href:"https://paion-data.github.io/aristotle/",children:"Aristotle"})," in production."]}),"\n",(0,i.jsx)(n.h2,{id:"prepare-for-production-development",children:"Prepare for Production Development"}),"\n",(0,i.jsx)(n.h3,{id:"installing-java-on-ubuntu",children:"Installing Java (on Ubuntu)"}),"\n",(0,i.jsx)(n.pre,{children:(0,i.jsx)(n.code,{className:"language-bash",children:"sudo apt update\nsudo apt install openjdk-17-jdk\n"})}),"\n",(0,i.jsx)(n.p,{children:"If we see something similar after typing the command with the version flag below we're good to go"}),"\n",(0,i.jsx)(n.pre,{children:(0,i.jsx)(n.code,{className:"language-bash",children:'$ java -version\nopenjdk version "17.0.11" 2024-04-16\nOpenJDK Runtime Environment (build 17.0.11+9-Ubuntu-120.04.2)\nOpenJDK 64-Bit Server VM (build 17.0.11+9-Ubuntu-120.04.2, mixed mode, sharing)\n'})}),"\n",(0,i.jsx)(n.h3,{id:"installing-maven",children:"Installing Maven"}),"\n",(0,i.jsx)(n.pre,{children:(0,i.jsx)(n.code,{className:"language-bash",children:"sudo apt install maven\n"})}),"\n",(0,i.jsx)(n.p,{children:"If we see something similar after typing the command with the version flag below we're good to go"}),"\n",(0,i.jsx)(n.pre,{children:(0,i.jsx)(n.code,{className:"language-bash",children:'$ mvn -version\nApache Maven 3.6.3\nMaven home: /usr/share/maven\nJava version: 17.0.11, vendor: Ubuntu, runtime: /usr/lib/jvm/java-17-openjdk-amd64\nDefault locale: en_US, platform encoding: UTF-8\nOS name: "linux", version: "5.4.0-182-generic", arch: "amd64", family: "unix"\n'})}),"\n",(0,i.jsx)(n.p,{children:"In the example, Maven is obviously using the correct JDK, so there is no need to set the JAVA_HOME environment variable\nextra. However, if you want to explicitly set JAVA_HOME, or in some cases (for example, when there are multiple JDK\ninstallations) make sure Maven always uses a specific JDK 17, You can add the following lines to your shell\nconfiguration file (such as.bashrc,.zshrc, or.profile) :"}),"\n",(0,i.jsx)(n.pre,{children:(0,i.jsx)(n.code,{className:"language-bash",children:"export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64\n"})}),"\n",(0,i.jsx)(n.h3,{id:"packaging-aristotle",children:"Packaging Aristotle"}),"\n",(0,i.jsx)(n.pre,{children:(0,i.jsx)(n.code,{className:"language-bash",children:"git clone git@github.com:paion-data/aristotle.git\nexport NEO4J_URI=YOUR_NEO4J_URI\nexport NEO4J_USERNAME=YOUR_NEO4J_USERNAME\nexport NEO4J_PASSWORD=YOUR_NEO4J_PASSWORD\nexport NEO4J_DATABASE=YOUR_NEO4J_DATABASE\nmvn clean package\n"})}),"\n",(0,i.jsxs)(n.p,{children:[(0,i.jsx)(n.a,{href:"https://paion-data.github.io/aristotle/",children:"Aristotle"})," is built on ",(0,i.jsx)(n.a,{href:"https://spring.io/projects/spring-boot",children:"Springboot"})," and has a built-in web container, which we\nused maven to package into a jar file."]}),"\n",(0,i.jsx)(n.h3,{id:"running-the-jar-package",children:"Running the JAR Package"}),"\n",(0,i.jsx)(n.pre,{children:(0,i.jsx)(n.code,{className:"language-bash",children:"java -jar target/Aristotle-1.0-SNAPSHOT.jar\n"})}),"\n",(0,i.jsxs)(n.p,{children:["The web service will run on port ",(0,i.jsx)(n.strong,{children:"8080"}),"."]}),"\n",(0,i.jsx)(n.h3,{id:"getting-openapi-documentation",children:"Getting OpenAPI Documentation"}),"\n",(0,i.jsxs)(n.p,{children:["You can access the OpenAPI documentation at ",(0,i.jsx)(n.strong,{children:(0,i.jsx)(n.a,{href:"http://localhost:8080/doc.html",children:"http://localhost:8080/doc.html"})}),". This documentation is built using ",(0,i.jsx)(n.strong,{children:"Swagger 2"})," and enhanced with ",(0,i.jsx)(n.strong,{children:"Knife4J"}),"."]})]})}function p(e={}){const{wrapper:n}={...(0,a.R)(),...e.components};return n?(0,i.jsx)(n,{...e,children:(0,i.jsx)(d,{...e})}):d(e)}},8453:(e,n,t)=>{t.d(n,{R:()=>s,x:()=>r});var i=t(6540);const a={},o=i.createContext(a);function s(e){const n=i.useContext(o);return i.useMemo((function(){return"function"==typeof e?e(n):{...n,...e}}),[n,e])}function r(e){let n;return n=e.disableParentContext?"function"==typeof e.components?e.components(a):e.components||a:s(e.components),i.createElement(o.Provider,{value:n},e.children)}}}]);