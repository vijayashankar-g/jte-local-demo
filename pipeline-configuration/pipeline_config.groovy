jte{
  allow_scm_jenkinsfile = false
  pipeline_template = "Jenkinsfile"
}


@merge libraries{
	merge = true
  	sonar
}
