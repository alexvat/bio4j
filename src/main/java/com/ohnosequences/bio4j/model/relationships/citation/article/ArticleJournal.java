/*
 * Copyright (C) 2010-2013  "Bio4j"
 *
 * This file is part of Bio4j
 *
 * Bio4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package com.ohnosequences.bio4j.model.relationships.citation.article;

import com.ohnosequences.bio4j.model.nodes.citation.Article;
import com.ohnosequences.bio4j.model.nodes.citation.Journal;
import com.ohnosequences.bio4j.model.relationships.BasicRelationship;

/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public interface ArticleJournal extends BasicRelationship{
    
    //--------GETTERS----------
    public String getDate();
    public String getVolume();
    public String getFirst();
    public String getLast();
    public Article getArticle();
    public Journal getJournal();

    //--------SETTERS------------
    public void setDate(String value);
    public void setVolume(String value);
    public void setFirst(String value);
    public void setLast(String value);
    
}
