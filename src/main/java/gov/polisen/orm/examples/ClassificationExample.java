package gov.polisen.orm.examples;

import java.util.ArrayList;
import java.util.List;

public class ClassificationExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table classifications
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	protected String	orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table classifications
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	protected boolean	distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table classifications
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	protected List<Criteria>	oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table classifications
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	public ClassificationExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table classifications
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table classifications
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table classifications
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table classifications
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table classifications
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table classifications
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table classifications
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table classifications
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table classifications
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table classifications
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table classifications
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion>	criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2,
				String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Short value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Short value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Short value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Short value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Short value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Short value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Short> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Short> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Short value1, Short value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Short value1, Short value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andShorthandIsNull() {
			addCriterion("shorthand is null");
			return (Criteria) this;
		}

		public Criteria andShorthandIsNotNull() {
			addCriterion("shorthand is not null");
			return (Criteria) this;
		}

		public Criteria andShorthandEqualTo(String value) {
			addCriterion("shorthand =", value, "shorthand");
			return (Criteria) this;
		}

		public Criteria andShorthandNotEqualTo(String value) {
			addCriterion("shorthand <>", value, "shorthand");
			return (Criteria) this;
		}

		public Criteria andShorthandGreaterThan(String value) {
			addCriterion("shorthand >", value, "shorthand");
			return (Criteria) this;
		}

		public Criteria andShorthandGreaterThanOrEqualTo(String value) {
			addCriterion("shorthand >=", value, "shorthand");
			return (Criteria) this;
		}

		public Criteria andShorthandLessThan(String value) {
			addCriterion("shorthand <", value, "shorthand");
			return (Criteria) this;
		}

		public Criteria andShorthandLessThanOrEqualTo(String value) {
			addCriterion("shorthand <=", value, "shorthand");
			return (Criteria) this;
		}

		public Criteria andShorthandLike(String value) {
			addCriterion("shorthand like", value, "shorthand");
			return (Criteria) this;
		}

		public Criteria andShorthandNotLike(String value) {
			addCriterion("shorthand not like", value, "shorthand");
			return (Criteria) this;
		}

		public Criteria andShorthandIn(List<String> values) {
			addCriterion("shorthand in", values, "shorthand");
			return (Criteria) this;
		}

		public Criteria andShorthandNotIn(List<String> values) {
			addCriterion("shorthand not in", values, "shorthand");
			return (Criteria) this;
		}

		public Criteria andShorthandBetween(String value1, String value2) {
			addCriterion("shorthand between", value1, value2, "shorthand");
			return (Criteria) this;
		}

		public Criteria andShorthandNotBetween(String value1, String value2) {
			addCriterion("shorthand not between", value1, value2, "shorthand");
			return (Criteria) this;
		}

		public Criteria andDescriptionIsNull() {
			addCriterion("description is null");
			return (Criteria) this;
		}

		public Criteria andDescriptionIsNotNull() {
			addCriterion("description is not null");
			return (Criteria) this;
		}

		public Criteria andDescriptionEqualTo(String value) {
			addCriterion("description =", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotEqualTo(String value) {
			addCriterion("description <>", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionGreaterThan(String value) {
			addCriterion("description >", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
			addCriterion("description >=", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLessThan(String value) {
			addCriterion("description <", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLessThanOrEqualTo(String value) {
			addCriterion("description <=", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLike(String value) {
			addCriterion("description like", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotLike(String value) {
			addCriterion("description not like", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionIn(List<String> values) {
			addCriterion("description in", values, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotIn(List<String> values) {
			addCriterion("description not in", values, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionBetween(String value1, String value2) {
			addCriterion("description between", value1, value2, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotBetween(String value1, String value2) {
			addCriterion("description not between", value1, value2, "description");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table classifications
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	public static class Criterion {
		private String	condition;
		private Object	value;
		private Object	secondValue;
		private boolean	noValue;
		private boolean	singleValue;
		private boolean	betweenValue;
		private boolean	listValue;
		private String	typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

		/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table classifications
     *
     * @mbggenerated do_not_delete_during_merge Thu Apr 03 15:25:33 CEST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}