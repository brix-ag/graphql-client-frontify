package ch.brix.gql.client.frontify.interfaces;

/**
 * `UserInterface` for `User` returnable types.
 */
@ch.brix.gql.client.PossibleTypes({ch.brix.gql.client.frontify.objects.AccountUser.class})
public interface User {
  /**
   * `User` Id.
   */
  ch.brix.gql.client.frontify.scalars.IdScalar getId();
  /**
   * **DEPRECATED** `User` email. This field will be removed. Use `AccountUser.email` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `AccountUser.email` instead. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  ch.brix.gql.client.frontify.scalars.EmailScalar getEmail();
  /**
   * `User` name.
   */
  ch.brix.gql.client.frontify.scalars.StringScalar getName();
  /**
   * **DEPRECATED** `User` avatar. This field will be removed. Use `AccountUser.avatar` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `AccountUser.avatar` instead. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  ch.brix.gql.client.frontify.scalars.UrlScalar getAvatar();
}
