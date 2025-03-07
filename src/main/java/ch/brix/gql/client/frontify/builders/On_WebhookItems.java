package ch.brix.gql.client.frontify.builders;

public class On_WebhookItems extends ch.brix.gql.client.TypeBuilder {
  public On_WebhookItems() {
    super(new ch.brix.gql.client.On("WebhookItems"));
  }
  /**
   * Total amount of results.
   */
  public On_WebhookItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_WebhookItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_WebhookItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_WebhookItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * List of type `Webhook`.
   */
  public On_WebhookItems items(WebhookItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
