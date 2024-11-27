
@xaver
Feature: US005 Visibility of Featured Services and relevant titles
  Background: Common steps
    Given Kullanici browser acar ve url ile anasayfaya gider
    When Anasayfada Featured Services basliginin bulundugunu dogrular

      Scenario: TC_003 Access to relevant Medical Treatment board under the "Featured services" title
        And Featured Services basliginin altinda Medical treatment panosuna erisir

        Scenario: TC_004 TC_004 Access to relevant Emergency help board under the "Featured services" title
         Then Featured Services basliginin altinda Emergency Help panosuna erisir

          Scenario: TC_005 Access to relevant Qualified Doctors board under the "Featured services" title
            Then Featured Services basliginin altinda Qualified Doctors panosuna erisir

            Scenario:  TC_006 Access to relevant Medical professionals board under the "Featured services" title
              Then  Featured Services basliginin altinda Professionals panosuna erisir


