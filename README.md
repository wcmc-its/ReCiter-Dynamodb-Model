# ReCiter-Dynamodb-Model
ReCiter-Dynamodb-Model

![Build Status](https://codebuild.us-east-1.amazonaws.com/badges?uuid=eyJlbmNyeXB0ZWREYXRhIjoiOVVLMU1kZ0lvOXNMOGhGdFFrUWZEL3lNdnVkVDJxSHh3c3RQTGhMVDlMbDRkVmNzK3lOcXZCQ2IxekpRa2ZMaUlaNnhmelU4NGJHYXNSeTQrdEFYbUw4PSIsIml2UGFyYW1ldGVyU3BlYyI6InBvN1FzdHdRYktVQi9hNnoiLCJtYXRlcmlhbFNldFNlcmlhbCI6MX0%3D&branch=master)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/edu.cornell.weill.reciter/reciter-dynamodb-model/badge.svg)](https://maven-badges.herokuapp.com/maven-central/edu.cornell.weill.reciter/reciter-dynamodb-model)
[![GitHub version](https://badge.fury.io/gh/wcmc-its%2FReCiter-Dynamodb-Model.svg)](https://badge.fury.io/gh/wcmc-its%2FReCiter-Dynamodb-Model)
[![codebeat badge](https://codebeat.co/badges/e08f97c0-ed25-4d90-a9de-7e39f0fd7377)](https://codebeat.co/projects/github-com-wcmc-its-reciter-dynamodb-model-master)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat-square)](http://makeapullrequest.com)
[![Pending Pull-Requests](http://githubbadges.herokuapp.com/wcmc-its/ReCiter-Dynamodb-Model/pulls.svg?style=flat)](https://github.com/wcmc-its/ReCiter-Dynamodb-Model/pulls)
[![Open Issues](http://githubbadges.herokuapp.com/wcmc-its/ReCiter-Dynamodb-Model/issues.svg?style=flat)](https://github.com/wcmc-its/ReCiter-Dynamodb-Model/issues)
[![star this repo](http://githubbadges.com/star.svg?user=wcmc-its&repo=ReCiter-Dynamodb-Model&style=flat)](https://github.com/wcmc-its/ReCiter-Dynamodb-Model)
[![fork this repo](http://githubbadges.com/fork.svg?user=wcmc-its&repo=ReCiter-Dynamodb-Model&style=flat)](https://github.com/wcmc-its/ReCiter-Dynamodb-Model/fork)
[![Github All Releases](https://img.shields.io/github/downloads/wcmc-its/ReCiter-Dynamodb-Model/total.svg)]()
[![Open Source Love](https://badges.frapsoft.com/os/v3/open-source.svg?v=102)](https://github.com/wcmc-its/ReCiter-Dynamodb-Model/) 


## Data model

The following are sample records from DynamoDB for the following tables:
- [Analysis](#Analysis)
- [ESearchResult](#ESearchResult)
- [GoldStandard](#GoldStandard)
- [Identity](#Identity)
- [InstitutionAfid](#InstitutionAfid)
- [MeshTerm](#MeshTerm)
- [ScienceMetrix](#ScienceMetrix)
- [ScienceMetrixDepartmentCategory](#ScienceMetrixDepartmentCategory)

Examples of the [PubMed data model](https://github.com/wcmc-its/ReCiter-PubMed-Model) and [Scopus data model](https://github.com/wcmc-its/ReCiter-Scopus-Model) are covered in their respective repositories.


### Analysis
```
{
  "personIdentifier": "meb7002",
  "dateAdded": "2019-01-22T22:07:43.395+0000",
  "dateUpdated": "2019-01-22T22:07:43.395+0000",
  "mode": "AS_EVIDENCE",
  "overallAccuracy": 1,
  "precision": 1,
  "recall": 1,
  "countSuggestedArticles": 18,
  "reCiterArticleFeatures": [
    {
      "pmid": 24694772,
      "pmcid": "PMC4180817",
      "totalArticleScoreStandardized": 10,
      "totalArticleScoreNonStandardized": 23.07,
      "userAssertion": "ACCEPTED",
      "publicationDateDisplay": "2014 Mar 30",
      "publicationDateStandardized": "2014-03-30",
      "datePublicationAddedToEntrez": "2014-04-04",
      "doi": "10.1016/j.jbi.2014.03.013",
      "publicationType": {
        "publicationTypeCanonical": "Academic Article",
        "publicationTypePubMed": [
          "Journal Article"
        ],
        "publicationTypeScopus": {
          "publicationTypeScopusAbbreviation": "ar",
          "publicationTypeScopusLabel": "Article"
        }
      },
      "timesCited": 4,
      "publicationAbstract": "OBJECTIVE: Publications are a key data source for investigator profiles and research networking systems. We developed ReCiter, an algorithm that automatically extracts bibliographies from PubMed using institutional information about the target investigators. METHODS: ReCiter executes a broad query against PubMed, groups the results into clusters that appear to constitute distinct author identities and selects the cluster that best matches the target investigator. Using information about investigators from one of our institutions, we compared ReCiter results to queries based on author name and institution and to citations extracted manually from the Scopus database. Five judges created a gold standard using citations of a random sample of 200 investigators. RESULTS: About half of the 10,471 potential investigators had no matching citations in PubMed, and about 45% had fewer than 70 citations. Interrater agreement (Fleiss' kappa) for the gold standard was 0.81. Scopus achieved the best recall (sensitivity) of 0.81, while name-based queries had 0.78 and ReCiter had 0.69. ReCiter attained the best precision (positive predictive value) of 0.93 while Scopus had 0.85 and name-based queries had 0.31. DISCUSSION: ReCiter accesses the most current citation data, uses limited computational resources and minimizes manual entry by investigators. Generation of bibliographies using named-based queries will not yield high accuracy. Proprietary databases can perform well but requite manual effort. Automated generation with higher recall is possible but requires additional knowledge about investigators.",
      "scopusDocID": "84907990604",
      "journalTitleVerbose": "Journal of biomedical informatics",
      "issn": [
        {
          "issntype": "Electronic",
          "issn": "1532-0480"
        },
        {
          "issntype": "Linking",
          "issn": "1532-0464"
        }
      ],
      "journalTitleISOabbreviation": "J Biomed Inform",
      "articleTitle": "Automatic generation of investigator bibliographies for institutional research networking systems.",
      "reCiterArticleAuthorFeatures": [
        {
          "rank": 1,
          "lastName": "Johnson",
          "firstName": "Stephen B",
          "initials": "S",
          "targetAuthor": false
        },
        {
          "rank": 2,
          "lastName": "Bales",
          "firstName": "Michael E",
          "initials": "M",
          "targetAuthor": true
        },
        {
          "rank": 3,
          "lastName": "Dine",
          "firstName": "Daniel",
          "initials": "D",
          "targetAuthor": false
        },
        {
          "rank": 4,
          "lastName": "Bakken",
          "firstName": "Suzanne",
          "initials": "S",
          "targetAuthor": false
        },
        {
          "rank": 5,
          "lastName": "Albert",
          "firstName": "Paul J",
          "initials": "P",
          "targetAuthor": false
        },
        {
          "rank": 6,
          "lastName": "Weng",
          "firstName": "Chunhua",
          "initials": "C",
          "targetAuthor": false
        }
      ],
      "volume": "51",
      "pages": "8-14",
      "evidence": {
        "acceptedRejectedEvidence": {
          "feedbackScoreAccepted": 3
        },
        "authorNameEvidence": {
          "institutionalAuthorName": {
            "firstName": "Michael",
            "firstInitial": "M",
            "middleName": "Eliot",
            "middleInitial": "E",
            "lastName": "Bales"
          },
          "articleAuthorName": {
            "firstName": "MichaelE",
            "firstInitial": "M",
            "lastName": "Bales"
          },
          "nameScoreTotal": 7.2,
          "nameMatchFirstType": "full-exact",
          "nameMatchFirstScore": 4.2,
          "nameMatchMiddleType": "inferredInitials-exact",
          "nameMatchMiddleScore": 1,
          "nameMatchLastType": "full-exact",
          "nameMatchLastScore": 2,
          "nameMatchModifierScore": 0
        },
        "journalCategoryEvidence": {
          "journalSubfieldScienceMetrixLabel": "Medical Informatics",
          "journalSubfieldScienceMetrixID": 36,
          "journalSubfieldDepartment": "Library",
          "journalSubfieldScore": 4.56
        },
        "affiliationEvidence": {
          "scopusTargetAuthorAffiliation": [
            {
              "targetAuthorInstitutionalAffiliationSource": "SCOPUS",
              "targetAuthorInstitutionalAffiliationIdentity": "Columbia University in the City of New York",
              "targetAuthorInstitutionalAffiliationArticleScopusLabel": "Columbia University in the City of New York",
              "targetAuthorInstitutionalAffiliationArticleScopusAffiliationId": 60030162,
              "targetAuthorInstitutionalAffiliationMatchType": "POSITIVE_MATCH_INDIVIDUAL",
              "targetAuthorInstitutionalAffiliationMatchTypeScore": 3
            }
          ],
          "pubmedTargetAuthorAffiliation": {
            "targetAuthorInstitutionalAffiliationArticlePubmedLabel": "Department of Biomedical Informatics, Columbia University, New York, United States.",
            "targetAuthorInstitutionalAffiliationMatchTypeScore": 0
          },
          "scopusNonTargetAuthorAffiliation": {
            "nonTargetAuthorInstitutionalAffiliationSource": "SCOPUS",
            "nonTargetAuthorInstitutionalAffiliationMatchKnownInstitution": [
              "Weill Cornell Medical College, 60007997, 5",
              "Columbia University in the City of New York, 60030162, 5"
            ],
            "nonTargetAuthorInstitutionalAffiliationScore": 3
          }
        },
        "relationshipEvidence": [
          {
            "relationshipName": {
              "firstName": "Paul",
              "firstInitial": "P",
              "middleName": "J",
              "middleInitial": "J",
              "lastName": "Albert"
            },
            "relationshipType": [
              "Shared organizational unit"
            ],
            "relationshipMatchType": "verbose",
            "relationshipMatchingScore": 2.2,
            "relationshipVerboseMatchModifierScore": 0.6,
            "relationshipMatchModifierMentor": 0,
            "relationshipMatchModifierMentorSeniorAuthor": 0,
            "relationshipMatchModifierManager": 0,
            "relationshipMatchModifierManagerSeniorAuthor": 0
          }
        ],
        "grantEvidence": {
          "grants": [
            {
              "institutionGrant": "TR-457",
              "articleGrant": "UL1 TR000457",
              "grantMatchScore": 3
            }
          ]
        },
        "educationYearEvidence": {
          "identityBachelorYear": 1995,
          "identityDoctoralYear": 2009,
          "articleYear": 2014,
          "discrepancyDegreeYearBachelor": 19,
          "discrepancyDegreeYearBachelorScore": 0,
          "discrepancyDegreeYearDoctoral": 5,
          "discrepancyDegreeYearDoctoralScore": 0
        },
        "personTypeEvidence": {
          "personType": "academic-faculty-weillfulltime",
          "personTypeScore": 2
        },
        "articleCountEvidence": {
          "countArticlesRetrieved": 38,
          "articleCountScore": 1.905
        },
        "averageClusteringEvidence": {
          "totalArticleScoreWithoutClustering": 27.47,
          "clusterScoreAverage": 20.81,
          "clusterReliabilityScore": 1,
          "clusterScoreModificationOfTotalScore": -4.4
        }
      }
    },
    {
      "pmid": 29339930,
      "pmcid": "PMC5764574",
      "totalArticleScoreStandardized": 10,
      "totalArticleScoreNonStandardized": 22.98,
      "userAssertion": "ACCEPTED",
      "publicationDateDisplay": "2018 Jan 02",
      "publicationDateStandardized": "2018-01-02",
      "datePublicationAddedToEntrez": "2018-01-18",
      "doi": "10.5195/jmla.2018.205",
      "publicationType": {
        "publicationTypeCanonical": "Academic Article",
        "publicationTypePubMed": [
          "Journal Article"
        ],
        "publicationTypeScopus": {
          "publicationTypeScopusAbbreviation": "ar",
          "publicationTypeScopusLabel": "Article"
        }
      },
      "timesCited": 2,
      "publicationAbstract": "Objective: The paper provides a review of current practices related to evaluation support services reported by seven biomedical and research libraries. Methods: A group of seven libraries from the United States and Canada described their experiences with establishing evaluation support services at their libraries. A questionnaire was distributed among the libraries to elicit information as to program development, service and staffing models, campus partnerships, training, products such as tools and reports, and resources used for evaluation support services. The libraries also reported interesting projects, lessons learned, and future plans. Results: The seven libraries profiled in this paper report a variety of service models in providing evaluation support services to meet the needs of campus stakeholders. The service models range from research center cores, partnerships with research groups, and library programs with staff dedicated to evaluation support services. A variety of products and services were described such as an automated tool to develop rank-based metrics, consultation on appropriate metrics to use for evaluation, customized publication and citation reports, resource guides, classes and training, and others. Implementing these services has allowed the libraries to expand their roles on campus and to contribute more directly to the research missions of their institutions. Conclusions: Libraries can leverage a variety of evaluation support services as an opportunity to successfully meet an array of challenges confronting the biomedical research community, including robust efforts to report and demonstrate tangible and meaningful outcomes of biomedical research and clinical care. These services represent a transformative direction that can be emulated by other biomedical and research libraries.",
      "scopusDocID": "85040927184",
      "journalTitleVerbose": "Journal of the Medical Library Association : JMLA",
      "issn": [
        {
          "issntype": "Electronic",
          "issn": "1558-9439"
        },
        {
          "issntype": "Linking",
          "issn": "1536-5050"
        }
      ],
      "journalTitleISOabbreviation": "J Med Libr Assoc",
      "articleTitle": "Research evaluation support services in biomedical libraries.",
      "reCiterArticleAuthorFeatures": [
        {
          "rank": 1,
          "lastName": "Gutzman",
          "firstName": "Karen Elizabeth",
          "initials": "K",
          "targetAuthor": false
        },
        {
          "rank": 2,
          "lastName": "Bales",
          "firstName": "Michael E",
          "initials": "M",
          "targetAuthor": true
        },
        {
          "rank": 3,
          "lastName": "Belter",
          "firstName": "Christopher W",
          "initials": "C",
          "targetAuthor": false
        },
        {
          "rank": 4,
          "lastName": "Chambers",
          "firstName": "Thane",
          "initials": "T",
          "targetAuthor": false
        },
        {
          "rank": 5,
          "lastName": "Chan",
          "firstName": "Liza",
          "initials": "L",
          "targetAuthor": false
        },
        {
          "rank": 6,
          "lastName": "Holmes",
          "firstName": "Kristi L",
          "initials": "K",
          "targetAuthor": false
        },
        {
          "rank": 7,
          "lastName": "Lu",
          "firstName": "Ya-Ling",
          "initials": "Y",
          "targetAuthor": false
        },
        {
          "rank": 8,
          "lastName": "Palmer",
          "firstName": "Lisa A",
          "initials": "L",
          "targetAuthor": false
        },
        {
          "rank": 9,
          "lastName": "Reznik-Zellen",
          "firstName": "Rebecca C",
          "initials": "R",
          "targetAuthor": false
        },
        {
          "rank": 10,
          "lastName": "Sarli",
          "firstName": "Cathy C",
          "initials": "C",
          "targetAuthor": false
        },
        {
          "rank": 11,
          "lastName": "Suiter",
          "firstName": "Amy M",
          "initials": "A",
          "targetAuthor": false
        },
        {
          "rank": 12,
          "lastName": "Wheeler",
          "firstName": "Terrie R",
          "initials": "T",
          "targetAuthor": false
        }
      ],
      "volume": "106",
      "issue": "1",
      "pages": "1-14",
      "evidence": {
        "acceptedRejectedEvidence": {
          "feedbackScoreAccepted": 3
        },
        "authorNameEvidence": {
          "institutionalAuthorName": {
            "firstName": "Michael",
            "firstInitial": "M",
            "middleName": "Eliot",
            "middleInitial": "E",
            "lastName": "Bales"
          },
          "articleAuthorName": {
            "firstName": "MichaelE",
            "firstInitial": "M",
            "lastName": "Bales"
          },
          "nameScoreTotal": 7.2,
          "nameMatchFirstType": "full-exact",
          "nameMatchFirstScore": 4.2,
          "nameMatchMiddleType": "inferredInitials-exact",
          "nameMatchMiddleScore": 1,
          "nameMatchLastType": "full-exact",
          "nameMatchLastScore": 2,
          "nameMatchModifierScore": 0
        },
        "journalCategoryEvidence": {
          "journalSubfieldScienceMetrixLabel": "Information & Library Sciences",
          "journalSubfieldScienceMetrixID": 75,
          "journalSubfieldDepartment": "Library",
          "journalSubfieldScore": 7.84
        },
        "affiliationEvidence": {
          "scopusTargetAuthorAffiliation": [
            {
              "targetAuthorInstitutionalAffiliationSource": "SCOPUS",
              "targetAuthorInstitutionalAffiliationArticleScopusLabel": "Samuel J. Wood Library",
              "targetAuthorInstitutionalAffiliationArticleScopusAffiliationId": 118359069,
              "targetAuthorInstitutionalAffiliationMatchType": "NO_MATCH",
              "targetAuthorInstitutionalAffiliationMatchTypeScore": -1
            }
          ],
          "scopusNonTargetAuthorAffiliation": {
            "nonTargetAuthorInstitutionalAffiliationSource": "SCOPUS",
            "nonTargetAuthorInstitutionalAffiliationMatchKnownInstitution": [
              "Samuel J. Wood Library &amp; C.V. Starr Biomedical Information Center, 117155719, 1"
            ],
            "nonTargetAuthorInstitutionalAffiliationScore": 0.25
          }
        },
        "relationshipEvidence": [
          {
            "relationshipName": {
              "firstName": "Terrie",
              "firstInitial": "T",
              "middleName": "Rose",
              "middleInitial": "R",
              "lastName": "Wheeler"
            },
            "relationshipType": [
              "Shared organizational unit"
            ],
            "relationshipMatchType": "verbose",
            "relationshipMatchingScore": 2.2,
            "relationshipVerboseMatchModifierScore": 0.6,
            "relationshipMatchModifierMentor": 0,
            "relationshipMatchModifierMentorSeniorAuthor": 0,
            "relationshipMatchModifierManager": 0,
            "relationshipMatchModifierManagerSeniorAuthor": 0
          }
        ],
        "educationYearEvidence": {
          "identityBachelorYear": 1995,
          "identityDoctoralYear": 2009,
          "articleYear": 2018,
          "discrepancyDegreeYearBachelor": 23,
          "discrepancyDegreeYearBachelorScore": 0,
          "discrepancyDegreeYearDoctoral": 9,
          "discrepancyDegreeYearDoctoralScore": 0
        },
        "personTypeEvidence": {
          "personType": "academic-faculty-weillfulltime",
          "personTypeScore": 2
        },
        "articleCountEvidence": {
          "countArticlesRetrieved": 38,
          "articleCountScore": 1.905
        },
        "averageClusteringEvidence": {
          "totalArticleScoreWithoutClustering": 20.99,
          "clusterScoreAverage": 23.99,
          "clusterReliabilityScore": 0,
          "clusterScoreModificationOfTotalScore": 1.98
        }
      }
    },
    {
      "pmid": 25046832,
      "pmcid": "PMC4260991",
      "totalArticleScoreStandardized": 10,
      "totalArticleScoreNonStandardized": 21.1,
      "userAssertion": "ACCEPTED",
      "publicationDateDisplay": "2014 Jul 19",
      "publicationDateStandardized": "2014-07-19",
      "datePublicationAddedToEntrez": "2014-07-22",
      "doi": "10.1016/j.jbi.2014.07.015",
      "publicationType": {
        "publicationTypeCanonical": "Academic Article",
        "publicationTypePubMed": [
          "Journal Article",
          "Research Support, N.I.H., Extramural"
        ],
        "publicationTypeScopus": {
          "publicationTypeScopusAbbreviation": "ar",
          "publicationTypeScopusLabel": "Article"
        }
      },
      "timesCited": 13,
      "publicationAbstract": "OBJECTIVES: To develop a method for investigating co-authorship patterns and author team characteristics associated with the publications in high-impact journals through the integration of public MEDLINE data and institutional scientific profile data. METHODS: For all current researchers at Columbia University Medical Center, we extracted their publications from MEDLINE authored between years 2007 and 2011 and associated journal impact factors, along with author academic ranks and departmental affiliations obtained from Columbia University Scientific Profiles (CUSP). Chi-square tests were performed on co-authorship patterns, with Bonferroni correction for multiple comparisons, to identify team composition characteristics associated with publication impact factors. We also developed co-authorship networks for the 25 most prolific departments between years 2002 and 2011 and counted the internal and external authors, inter-connectivity, and centrality of each department. RESULTS: Papers with at least one author from a basic science department are significantly more likely to appear in high-impact journals than papers authored by those from clinical departments alone. Inclusion of at least one professor on the author list is strongly associated with publication in high-impact journals, as is inclusion of at least one research scientist. Departmental and disciplinary differences in the ratios of within- to outside-department collaboration and overall network cohesion are also observed. CONCLUSIONS: Enrichment of co-authorship patterns with author scientific profiles helps uncover associations between author team characteristics and appearance in high-impact journals. These results may offer implications for mentoring junior biomedical researchers to publish on high-impact journals, as well as for evaluating academic progress across disciplines in modern academic medical centers.",
      "scopusDocID": "84907994832",
      "journalTitleVerbose": "Journal of biomedical informatics",
      "issn": [
        {
          "issntype": "Electronic",
          "issn": "1532-0480"
        },
        {
          "issntype": "Linking",
          "issn": "1532-0464"
        }
      ],
      "journalTitleISOabbreviation": "J Biomed Inform",
      "articleTitle": "Associating co-authorship patterns with publications in high-impact journals.",
      "reCiterArticleAuthorFeatures": [
        {
          "rank": 1,
          "lastName": "Bales",
          "firstName": "Michael E",
          "initials": "M",
          "targetAuthor": true
        },
        {
          "rank": 2,
          "lastName": "Dine",
          "firstName": "Daniel C",
          "initials": "D",
          "targetAuthor": false
        },
        {
          "rank": 3,
          "lastName": "Merrill",
          "firstName": "Jacqueline A",
          "initials": "J",
          "targetAuthor": false
        },
        {
          "rank": 4,
          "lastName": "Johnson",
          "firstName": "Stephen B",
          "initials": "S",
          "targetAuthor": false
        },
        {
          "rank": 5,
          "lastName": "Bakken",
          "firstName": "Suzanne",
          "initials": "S",
          "targetAuthor": false
        },
        {
          "rank": 6,
          "lastName": "Weng",
          "firstName": "Chunhua",
          "initials": "C",
          "targetAuthor": false
        }
      ],
      "volume": "52",
      "pages": "311-8",
      "evidence": {
        "acceptedRejectedEvidence": {
          "feedbackScoreAccepted": 3
        },
        "authorNameEvidence": {
          "institutionalAuthorName": {
            "firstName": "Michael",
            "firstInitial": "M",
            "middleName": "Eliot",
            "middleInitial": "E",
            "lastName": "Bales"
          },
          "articleAuthorName": {
            "firstName": "MichaelE",
            "firstInitial": "M",
            "lastName": "Bales"
          },
          "nameScoreTotal": 7.2,
          "nameMatchFirstType": "full-exact",
          "nameMatchFirstScore": 4.2,
          "nameMatchMiddleType": "inferredInitials-exact",
          "nameMatchMiddleScore": 1,
          "nameMatchLastType": "full-exact",
          "nameMatchLastScore": 2,
          "nameMatchModifierScore": 0
        },
        "journalCategoryEvidence": {
          "journalSubfieldScienceMetrixLabel": "Medical Informatics",
          "journalSubfieldScienceMetrixID": 36,
          "journalSubfieldDepartment": "Library",
          "journalSubfieldScore": 4.56
        },
        "affiliationEvidence": {
          "scopusTargetAuthorAffiliation": [
            {
              "targetAuthorInstitutionalAffiliationSource": "SCOPUS",
              "targetAuthorInstitutionalAffiliationIdentity": "Columbia University in the City of New York",
              "targetAuthorInstitutionalAffiliationArticleScopusLabel": "Columbia University in the City of New York",
              "targetAuthorInstitutionalAffiliationArticleScopusAffiliationId": 60030162,
              "targetAuthorInstitutionalAffiliationMatchType": "POSITIVE_MATCH_INDIVIDUAL",
              "targetAuthorInstitutionalAffiliationMatchTypeScore": 3
            }
          ],
          "pubmedTargetAuthorAffiliation": {
            "targetAuthorInstitutionalAffiliationArticlePubmedLabel": "Department of Biomedical Informatics, Columbia University, New York City, United States; The Irving Institute for Clinical and Translational Research, Columbia University, New York City, United States.",
            "targetAuthorInstitutionalAffiliationMatchTypeScore": 0
          },
          "scopusNonTargetAuthorAffiliation": {
            "nonTargetAuthorInstitutionalAffiliationSource": "SCOPUS",
            "nonTargetAuthorInstitutionalAffiliationMatchKnownInstitution": [
              "Columbia University in the City of New York, 60030162, 5",
              "Weill Cornell Medical College, 60007997, 5"
            ],
            "nonTargetAuthorInstitutionalAffiliationScore": 3
          }
        },
        "educationYearEvidence": {
          "identityBachelorYear": 1995,
          "identityDoctoralYear": 2009,
          "articleYear": 2014,
          "discrepancyDegreeYearBachelor": 19,
          "discrepancyDegreeYearBachelorScore": 0,
          "discrepancyDegreeYearDoctoral": 5,
          "discrepancyDegreeYearDoctoralScore": 0
        },
        "personTypeEvidence": {
          "personType": "academic-faculty-weillfulltime",
          "personTypeScore": 2
        },
        "articleCountEvidence": {
          "countArticlesRetrieved": 38,
          "articleCountScore": 1.905
        },
        "averageClusteringEvidence": {
          "totalArticleScoreWithoutClustering": 21.66,
          "clusterScoreAverage": 20.81,
          "clusterReliabilityScore": 1,
          "clusterScoreModificationOfTotalScore": -0.57
        }
      }
    }
  ]
}
```


### ESearchResult

```
{
  "esearchpmids": [
    {
      "pmids": [
        18999104,
        18999235,
        29339930,
        12737732,
        22174805,
        16779175,
        16122973,
        24694772,
        24551322,
        23920961,
        16799117,
        25046832,
        17712094,
        21665073,
        16442849,
        12396934,
        26174865,
        20351816
      ],
      "retrievalDate": "2018-12-17T22:43:55.621Z",
      "retrievalStrategyName": "GoldStandardRetrievalStrategy"
    },
    {
      "pmids": [
        26321617,
        25542278,
        25162297,
        12737732,
        22174805,
        22667600,
        9570776,
        24694772,
        18323354,
        16799117,
        25046832,
        17712094,
        25658323,
        12650523,
        16442849,
        26174865,
        18999104,
        15259657,
        18999235,
        12242713,
        29339930,
        15316108,
        16779175,
        19896325,
        16122973,
        24551322,
        23920961,
        22109629,
        25844580,
        27367385,
        9672811,
        29724735,
        21665073,
        12396934,
        9402739,
        24395785,
        20351816,
        26599914
      ],
      "retrievalDate": "2018-12-17T22:43:59.453Z",
      "retrievalStrategyName": "FirstNameInitialRetrievalStrategy"
    }
  ],
  "retrievalDate": "2019-01-22T22:07:42.547Z",
  "uid": "meb7002"
}
```

### GoldStandard
```
{
  "auditLog": [
    {
      "action": "ACCEPTED",
      "dateTime": "2019-01-22T20:24:01.946Z",
      "pmids": [
        17712094,
        21665073,
        16442849,
        20351816,
        25046832,
        16122973,
        18999235,
        16799117,
        18999104,
        16779175,
        24694772,
        12396934,
        12737732,
        22174805,
        24551322,
        29339930
      ],
      "uid": "reciter-inst-client",
      "userVerbose": "Institutional Client"
    },
    {
      "action": "ACCEPTED",
      "dateTime": "2019-01-21T20:26:44.714Z",
      "pmids": [
        17712094,
        21665073,
        16442849,
        20351816,
        25046832,
        16122973,
        18999235,
        16799117,
        18999104,
        16779175,
        24694772,
        12396934,
        12737732,
        22174805,
        24551322,
        29339930
      ],
      "uid": "reciter-inst-client",
      "userVerbose": "Institutional Client"
    }
  ],
  "knownpmids": [
    17712094,
    21665073,
    16442849,
    20351816,
    25046832,
    16122973,
    18999235,
    16799117,
    18999104,
    16779175,
    24694772,
    12396934,
    12737732,
    22174805,
    24551322,
    29339930,
    26174865,
    23920961
  ],
  "uid": "meb7002"
}
```


### Identity
```
{
  "identity": {
    "alternateNames": [
      {
        "firstInitial": "P",
        "firstName": "Paul",
        "lastName": "Albert",
        "middleInitial": "J",
        "middleName": "J."
      },
      {
        "firstInitial": "P",
        "firstName": "Paul",
        "lastName": "Albert"
      }
    ],
    "degreeYear": {
      "bachelorYear": 1997,
      "doctoralYear": 0
    },
    "emails": [
      "paa2013@med.cornell.edu",
      "palbert1@gmail.com"
    ],
    "grants": [
      "RR029822"
    ],
    "institutions": [
      "Colgate University",
      "Weill Cornell Medical College, Cornell University",
      "Columbia University, Teachers College",
      "Pratt Institute"
    ],
    "knownRelationships": [
      {
        "name": {
          "firstInitial": "P",
          "firstName": "Peter",
          "lastName": "Michielini",
          "middleInitial": "C",
          "middleName": "C"
        },
        "type": "Co-investigator",
        "uid": "pem2010"
      },
      {
        "name": {
          "firstInitial": "T",
          "firstName": "Terrie",
          "lastName": "Wheeler",
          "middleInitial": "R",
          "middleName": "Rose"
        },
        "type": "Manager",
        "uid": "tew2004"
      },
      {
        "name": {
          "firstInitial": "M",
          "firstName": "Michael",
          "lastName": "Bales",
          "middleInitial": "E",
          "middleName": "Eliot"
        },
        "type": "Shared organizational unit",
        "uid": "meb7002"
      },
      {
        "name": {
          "firstInitial": "S",
          "firstName": "Shelia",
          "lastName": "Sinclair",
          "middleInitial": "J",
          "middleName": "J."
        },
        "type": "Shared organizational unit",
        "uid": "sjs2007"
      },
      {
        "name": {
          "firstInitial": "E",
          "firstName": "Edsel",
          "lastName": "Watkins"
        },
        "type": "Shared organizational unit",
        "uid": "ewatkins"
      }
    ],
    "organizationalUnits": [
      {
        "organizationalUnitLabel": "Library",
        "organizationalUnitType": "DEPARTMENT"
      },
      {
        "organizationalUnitLabel": "Library",
        "organizationalUnitType": "DEPARTMENT"
      }
    ],
    "personTypes": [
      "academic",
      "academic-faculty",
      "academic-faculty-associate",
      "academic-faculty-weillfulltime",
      "employee-academic",
      "employee-exempt",
      "employee",
      "affiliate",
      "affiliate-federated",
      "affiliate-federated-affiliate"
    ],
    "primaryName": {
      "firstInitial": "P",
      "firstName": "Paul",
      "lastName": "Albert",
      "middleInitial": "J",
      "middleName": "J"
    },
    "pubMedAlias": [],
    "title": "Associate Librarian",
    "uid": "paa2013"
  },
  "uid": "paa2013"
}
```

### InstitutionAfid
```
{
  "afids": [
    "60027161",
    "60030184"
  ],
  "institution": "Ben-Gurion University"
}
```

### MeshTerm

```
{
  "count": 174,
  "mesh": "Acetyl-CoA Hydrolase"
}
```

### ScienceMetrix
```
{
  "issn": "1551-7489",
  "publicationName": "Journal of opioid management",
  "scienceMatrixSubfieldId": "98",
  "scienceMetrixDomain": "Health Sciences",
  "scienceMetrixField": "Clinical Medicine",
  "scienceMetrixSubfield": "Anesthesiology",
  "smsid": 104075
}
```

### ScienceMetrixDepartmentCategory
```
{
  "logOddsRatio": 1.65,
  "pk": 31,
  "primaryDepartment": "Healthcare Policy and Research",
  "scienceMetrixJournalSubfield": "Health Policy & Services",
  "scienceMetrixJournalSubfieldId": 139
}
```
