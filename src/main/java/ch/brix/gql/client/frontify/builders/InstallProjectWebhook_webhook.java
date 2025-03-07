package ch.brix.gql.client.frontify.builders;

public class InstallProjectWebhook_webhook extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.Webhook> {
  public InstallProjectWebhook_webhook() {
    super(new ch.brix.gql.client.Call<>("webhook", "Webhook"));
  }
  public InstallProjectWebhook_webhook onProjectWebhook(On_ProjectWebhook typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public InstallProjectWebhook_webhook onWebhook(On_Webhook typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
