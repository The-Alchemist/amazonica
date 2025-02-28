(defproject amazonica "0.3.162"
  :description "A comprehensive Clojure client for the entire Amazon AWS api."
  :url "https://github.com/mcohen01/amazonica"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :java-source-paths ["src/main/java"]
  :javac-options ["-target" "1.8" "-source" "1.8"]
  :target-path "target"
  :deploy-repositories [["releases" :clojars]]
  :dependencies [[org.clojure/clojure "1.8.0" :scope "provided"]
                 [org.clojure/algo.generic "0.1.2"]
                 [com.amazonaws/aws-java-sdk "1.12.132" :exclusions [joda-time]]
                 [com.amazonaws/amazon-kinesis-client "1.14.7" :exclusions [joda-time]]
                 [com.amazonaws/dynamodb-streams-kinesis-adapter "1.5.2"
                  :exclusions [com.amazonaws/amazon-kinesis-client
                               com.amazonaws/aws-java-sdk-cloudwatch
                               com.amazonaws/aws-java-sdk-dynamodb
                               com.amazonaws/aws-java-sdk-kinesis
                               joda-time]]
                 [joda-time "2.9.6"]
                 [robert/hooke "1.3.0"]
                 [com.taoensso/nippy "3.1.1"]]
  :jvm-opts     ["-Damazonica.internal.test.using-sources=false"]
  :eastwood {:exclude-linters [:def-in-def :deprecations :unlimited-use :unused-ret-vals :local-shadows-var]
             :ignored-faults {:wrong-arity {amazonica.test.s3 true
                                            amazonica.test.kinesis-firehose true}}}
  :profiles {:dev {:plugins [[jonase/eastwood "0.5.2"]]}
             :1.8         {:dependencies [[org.clojure/clojure "1.8.0"]]}
             :1.9         {:dependencies [[org.clojure/clojure "1.9.0"]]}
             :1.10.1      {:dependencies [[org.clojure/clojure "1.10.1"]]}
             :1.10.2      {:dependencies [[org.clojure/clojure "1.10.2"]]}
             :1.10.3      {:dependencies [[org.clojure/clojure "1.10.3"]]}
             :aws-sources {:jvm-opts     ["-Damazonica.internal.test.using-sources=true"]
                           :dependencies [[com.amazonaws/amazon-kinesis-client "1.14.7" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-accessanalyzer "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-acm "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-acmpca "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-alexaforbusiness "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-amplify "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-api-gateway "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-apigatewaymanagementapi "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-apigatewayv2 "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-appconfig "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-appflow "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-applicationautoscaling "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-applicationinsights "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-appmesh "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-appstream "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-appsync "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-athena "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-augmentedairuntime "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-autoscaling "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-autoscalingplans "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-backup "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-batch "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-braket "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-budgets "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-chime "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-cloud9 "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-clouddirectory "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-cloudformation "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-cloudfront "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-cloudhsm "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-cloudhsmv2 "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-cloudsearch "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-cloudtrail "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-cloudwatch "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-cloudwatchmetrics "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-codeartifact "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-codebuild "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-codecommit "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-codedeploy "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-codeguruprofiler "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-codegurureviewer "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-codepipeline "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-codestar "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-codestarconnections "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-codestarnotifications "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-cognitoidentity "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-cognitoidp "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-cognitosync "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-comprehend "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-comprehendmedical "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-computeoptimizer "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-config "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-connect "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-connectparticipant "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-core "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-costandusagereport "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-costexplorer "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-dataexchange "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-datapipeline "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-datasync "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-dax "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-detective "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-devicefarm "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-directconnect "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-directory "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-discovery "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-dlm "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-dms "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-docdb "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-dynamodb "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-ebs "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-ec2 "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-ec2instanceconnect "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-ecr "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-ecs "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-efs "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-eks "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-elasticache "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-elasticbeanstalk "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-elasticinference "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-elasticloadbalancing "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-elasticloadbalancingv2 "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-elasticsearch "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-elastictranscoder "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-emr "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-eventbridge "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-events "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-fms "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-forecast "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-forecastquery "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-frauddetector "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-fsx "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-gamelift "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-glacier "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-globalaccelerator "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-glue "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-greengrass "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-groundstation "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-guardduty "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-health "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-honeycode "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-iam "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-identitystore "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-imagebuilder "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-importexport "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-inspector "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-iot "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-iot1clickdevices "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-iot1clickprojects "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-iotanalytics "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-iotevents "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-ioteventsdata "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-iotjobsdataplane "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-iotsecuretunneling "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-iotsitewise "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-iotthingsgraph "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-ivs "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-kafka "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-kendra "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-kinesis "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-kinesisanalyticsv2 "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-kinesisvideo "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-kinesisvideosignalingchannels "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-kms "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-lakeformation "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-lambda "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-lex "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-lexmodelbuilding "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-licensemanager "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-lightsail "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-logs "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-machinelearning "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-macie "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-macie2 "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-managedblockchain "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-marketplacecatalog "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-marketplacecommerceanalytics "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-marketplaceentitlement "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-marketplacemeteringservice "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-mechanicalturkrequester "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-mediaconnect "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-mediaconvert "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-medialive "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-mediapackage "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-mediapackagevod "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-mediastore "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-mediastoredata "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-mediatailor "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-migrationhub "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-migrationhubconfig "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-mobile "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-models "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-mq "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-neptune "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-networkmanager "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-opsworks "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-opsworkscm "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-organizations "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-outposts "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-personalize "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-personalizeevents "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-personalizeruntime "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-pi "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-pinpoint "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-pinpointemail "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-pinpointsmsvoice "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-polly "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-pricing "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-qldb "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-qldbsession "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-quicksight "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-ram "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-rds "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-rdsdata "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-redshift "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-rekognition "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-resourcegroups "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-resourcegroupstaggingapi "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-robomaker "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-route53 "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-route53resolver "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-s3 "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-s3control "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-sagemaker "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-sagemakerruntime "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-savingsplans "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-schemas "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-secretsmanager "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-securityhub "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-serverlessapplicationrepository "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-servermigration "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-servicecatalog "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-servicediscovery "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-servicequotas "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-ses "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-sesv2 "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-shield "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-signer "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-simpledb "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-simpleworkflow "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-snowball "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-sns "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-sqs "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-ssm "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-sso "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-ssooidc "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-stepfunctions "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-storagegateway "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-sts "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-support "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-swf-libraries "1.11.22" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-synthetics "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-textract "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-timestreamwrite "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-timestreamquery "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-transcribe "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-transfer "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-translate "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-waf "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-wafv2 "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-workdocs "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-worklink "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-workmail "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-workmailmessageflow "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-workspaces "1.12.132" :classifier "sources"]
                                          [com.amazonaws/aws-java-sdk-xray "1.12.132" :classifier "sources"]
                                          ;; the :exclusions prevent warnings due to version ranges:
                                          [com.amazonaws/dynamodb-streams-kinesis-adapter "1.5.3" :classifier "sources" :exclusions [*]]
                                          [com.amazonaws/jmespath-java "1.12.132" :classifier "sources"]
                                          [software.amazon.ion/ion-java "1.0.2" :classifier "sources"]]}})
