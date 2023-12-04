package ch.brix.gql.client.frontify.builders;

public class UninstallWebhook_webhook extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.Webhook> {
  public UninstallWebhook_webhook() {
    super(new ch.brix.gql.client.Call<>("webhook", "Webhook"));
  }
  public UninstallWebhook_webhook onProjectWebhook(On_ProjectWebhook typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public UninstallWebhook_webhook onWebhook(On_Webhook typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
