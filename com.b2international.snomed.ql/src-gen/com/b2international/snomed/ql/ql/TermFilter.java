/**
 * Copyright 2020-2021 B2i Healthcare Pte Ltd, http://b2i.sg
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.b2international.snomed.ql.ql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.b2international.snomed.ql.ql.TermFilter#getLexicalSearchType <em>Lexical Search Type</em>}</li>
 *   <li>{@link com.b2international.snomed.ql.ql.TermFilter#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @see com.b2international.snomed.ql.ql.QlPackage#getTermFilter()
 * @model
 * @generated
 */
public interface TermFilter extends PropertyFilter
{
  /**
   * Returns the value of the '<em><b>Lexical Search Type</b></em>' attribute.
   * The literals are from the enumeration {@link com.b2international.snomed.ql.ql.LexicalSearchType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lexical Search Type</em>' attribute.
   * @see com.b2international.snomed.ql.ql.LexicalSearchType
   * @see #setLexicalSearchType(LexicalSearchType)
   * @see com.b2international.snomed.ql.ql.QlPackage#getTermFilter_LexicalSearchType()
   * @model
   * @generated
   */
  LexicalSearchType getLexicalSearchType();

  /**
   * Sets the value of the '{@link com.b2international.snomed.ql.ql.TermFilter#getLexicalSearchType <em>Lexical Search Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lexical Search Type</em>' attribute.
   * @see com.b2international.snomed.ql.ql.LexicalSearchType
   * @see #getLexicalSearchType()
   * @generated
   */
  void setLexicalSearchType(LexicalSearchType value);

  /**
   * Returns the value of the '<em><b>Term</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term</em>' attribute.
   * @see #setTerm(String)
   * @see com.b2international.snomed.ql.ql.QlPackage#getTermFilter_Term()
   * @model
   * @generated
   */
  String getTerm();

  /**
   * Sets the value of the '{@link com.b2international.snomed.ql.ql.TermFilter#getTerm <em>Term</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term</em>' attribute.
   * @see #getTerm()
   * @generated
   */
  void setTerm(String value);

} // TermFilter
