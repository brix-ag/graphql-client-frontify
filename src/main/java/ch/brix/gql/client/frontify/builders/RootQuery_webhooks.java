package ch.brix.gql.client.frontify.builders;

public class RootQuery_webhooks extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.WebhookItems> {
  public RootQuery_webhooks() {
    super(new ch.brix.gql.client.Call<>("webhooks", "WebhookItems"));
  }
  public RootQuery_webhooks args(RootQuery_webhooks_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootQuery_webhooks onWebhookItems(On_WebhookItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
