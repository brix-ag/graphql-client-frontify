package ch.brix.gql.client.frontify.builders;

public class WebhookItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.interfaces.Webhook>> {
  public WebhookItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "Webhook"));
  }
  public WebhookItems_items onProjectWebhook(On_ProjectWebhook typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public WebhookItems_items onWebhook(On_Webhook typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
