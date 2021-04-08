select last_name, job_id, salary from employees 
where job_id = 'SALEREP' OR job_id = 'STOCKCLERK' AND salary NOT IN (2500, 3500, 7000);
