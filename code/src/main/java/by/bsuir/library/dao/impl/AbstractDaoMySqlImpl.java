package by.bsuir.library.dao.impl;

import by.bsuir.library.dao.util.WrapMySqlConnect;

/**
 * Abstract class for SQL variables
 * @author Svetlana Reznichenko
 *
 */
abstract class AbstractDaoMySqlImpl {
	
	/** protected variable for SQL columns "user" */
	protected static final String SQL_USER = "user";
	/** protected variable for SQL columns "book" */
    protected static final String SQL_BOOK = "book";
    /** protected variable for SQL columns "author" */
    protected static final String SQL_AUTHOR = "author";
    /** protected variable for SQL columns "booking" */
    protected static final String SQL_BOOKING = "booking";
    /** protected variable for SQL columns "order" */
    protected static final String SQL_ORDER = "order";
    /** protected variable for SQL columns "id" */
    protected static final String SQL_ID = "id";
    /** protected variable for SQL columns "name" */
    protected static final String SQL_NAME = "name";
    /** protected variable for SQL columns "surname" */
    protected static final String SQL_USER_SURNAME = "surname";
    /** protected variable for SQL columns "password" */
    protected static final String SQL_USER_PASSWORD = "password";
    /** protected variable for SQL columns "login" */
    protected static final String SQL_USER_LOGIN = "login";
    /** protected variable for SQL columns "email" */
    protected static final String SQL_USER_EMAIL = "email";
    /** protected variable for SQL columns "role" */
    protected static final String SQL_USER_ROLE = "role";
    /** protected variable for SQL columns "authorId" */
    protected static final String SQL_BOOK_AUTHOR_ID = "authorId";
    /** protected variable for SQL columns "amount" */
    protected static final String SQL_BOOK_AMOUNT = "amount";
    /** protected variable for SQL columns "title" */
    protected static final String SQL_BOOK_TITLE = "title";
    /** protected variable for SQL columns "name" */
    protected static final String SQL_BOOK_AUTHOR = "name";
    /** protected variable for SQL columns "date_booking" */
    protected static final String SQL_BOOKIND_DATE = "date_booking";
    /** protected variable for SQL columns "user_id" */
    protected static final String SQL_BOOKING_USER_ID = "user_id";
    /** protected variable for SQL columns "book_id" */
    protected static final String SQL_BOOKING_BOOK_ID = "book_id";
    /** protected variable for SQL columns "is_approved" */
    protected static final String SQL_BOOKING_IS_APPROVED = "is_approved";
    /** protected variable for SQL columns "date_take" */
    protected static final String SQL_ORDER_DATE = "date_take";
    /** protected variable for SQL columns "is_returned" */
    protected static final String SQL_ORDER_IS_RETURNED = "is_returned";
    /** protected variable for SQL columns "booking_id" */
    protected static final String SQL_ORDER_BOOKING_ID = "booking_id";

	WrapMySqlConnect wcn;
	{
		wcn = new WrapMySqlConnect();
	}
	
}
