package ch.brix.gql.client.frontify.builders;

public class RootQuery_webhooks_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * How many `WebhookItems` to show per query. Min: 1, Max: 100.
   * Default value: 25
   */
  public RootQuery_webhooks_Args limit(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("limit", value);
    return this;
  }
  /**
   * Current page number.
   * Default value: 1
   */
  public RootQuery_webhooks_Args page(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("page", value);
    return this;
  }
}
