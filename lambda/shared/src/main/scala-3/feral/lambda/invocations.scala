/*
 * Copyright 2021 Typelevel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package feral.lambda

import events._

@deprecated("Renamed to Invocation", "0.3.0")
type LambdaEnv[F[_], Event] = Invocation[F, Event]
@deprecated("Renamed to Invocation", "0.3.0")
val LambdaEnv = Invocation

type ApiGatewayProxyInvocation[F[_]] = Invocation[F, ApiGatewayProxyEventV2]
type DynamoDbStreamInvocation[F[_]] = Invocation[F, DynamoDbStreamEvent]
type KinesisStreamInvocation[F[_]] = Invocation[F, KinesisStreamEvent]
type S3BatchInvocation[F[_]] = Invocation[F, S3BatchEvent]
type SnsInvocation[F[_]] = Invocation[F, SnsEvent]
type SqsInvocation[F[_]] = Invocation[F, SqsEvent]
