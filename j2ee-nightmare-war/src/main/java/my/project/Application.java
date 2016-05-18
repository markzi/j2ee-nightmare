/**
 * Copyright (c) HPI Limited 2015
 * 
 * All rights reserved. No part of this work may be reproduced or transmitted, in any form or by any
 * means, or adapted (including for the purposes of error correction) without the written permission
 * of the copyright owner except in accordance with the provisions of the Copyright, Designs and
 * Patents Act 1988 or under the terms of a Licence entered into with the copyright owner.
 * 
 * Warning: the doing of an unauthorised act in relation to a copyright work may result in both a
 * civil claim for damages and a criminal prosecution.
 */

package my.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author UKHAmhom
 *
 */
@RestController
@EnableAutoConfiguration
public class Application
{
	MyClient client = new MyClient();
	
    @RequestMapping("/")
    String home()
    {
    	client.callMyLocalBusinessMethod();
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception
    {
        SpringApplication.run(Application.class, args);
    }
}
